package org.food.host.system.application.domain.menu.command.handler;

import lombok.extern.slf4j.Slf4j;
import org.food.host.system.application.domain.menu.command.command.CreateMenuCommand;
import org.food.host.system.application.domain.menu.dto.CreateMenuResponseDTO;
import org.food.host.system.application.domain.menu.mapper.MenuDataMapper;
import org.food.host.system.application.domain.menu.ports.output.repository.MenuRepository;
import org.food.host.system.domain.menu.MenuDomainService;
import org.food.host.system.domain.menu.entity.Menu;
import org.food.host.system.domain.menu.event.MenuCreatedEvent;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Component
public class CreateMenuCommandHandler {
    private final MenuDomainService menuDomainService;
    private final MenuDataMapper menuDataMapper;
    private final MenuRepository menuRepository;

    public CreateMenuCommandHandler(MenuDomainService menuDomainService, MenuDataMapper menuDataMapper, MenuRepository menuRepository) {
        this.menuDomainService = menuDomainService;
        this.menuDataMapper = menuDataMapper;
        this.menuRepository = menuRepository;
    }

    @Transactional
    public CreateMenuResponseDTO createMenu(CreateMenuCommand createMenuCommand) {
        Menu menu = menuDataMapper.createMenuCommandToMenu(createMenuCommand);
        MenuCreatedEvent menuCreatedEvent = menuDomainService.createMenu(menu);
        menuRepository.createOrder(menu);
        log.info("Menu is created with id: {}", menu.getId().getValue());
        return CreateMenuResponseDTO.builder().message("Menu is created with id: " + menuCreatedEvent.getMenu().getId().getValue()).build();
    }
}
