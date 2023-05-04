package org.food.host.system.application.domain.menu;

import lombok.extern.slf4j.Slf4j;
import org.food.host.system.application.domain.menu.command.command.CreateMenuCommand;
import org.food.host.system.application.domain.menu.command.handler.CreateMenuCommandHandler;
import org.food.host.system.application.domain.menu.dto.CreateMenuResponseDTO;
import org.food.host.system.application.domain.menu.dto.GetMenuByHostResponseDTO;
import org.food.host.system.application.domain.menu.ports.input.service.MenuApplicationService;
import org.food.host.system.application.domain.menu.query.handler.GetMenuByHostQueryHandler;
import org.food.host.system.application.domain.menu.query.query.GetMenuByHostQuery;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Slf4j
@Validated
@Service
public class MenuApplicationServiceImpl implements MenuApplicationService {
    private final CreateMenuCommandHandler createMenuCommandHandler;
    private final GetMenuByHostQueryHandler getMenuByHostQueryHandler;

    public MenuApplicationServiceImpl(CreateMenuCommandHandler createMenuCommandHandler, GetMenuByHostQueryHandler getMenuByHostQueryHandler) {
        this.createMenuCommandHandler = createMenuCommandHandler;
        this.getMenuByHostQueryHandler = getMenuByHostQueryHandler;
    }

    @Override
    public CreateMenuResponseDTO createMenu(CreateMenuCommand createMenuCommand) {
        return createMenuCommandHandler.createMenu(createMenuCommand);
    }

    @Override
    public GetMenuByHostResponseDTO getMenuByHost(GetMenuByHostQuery getMenuByHostQuery) {
        return getMenuByHostQueryHandler.getMenuByHost(getMenuByHostQuery);
    }
}
