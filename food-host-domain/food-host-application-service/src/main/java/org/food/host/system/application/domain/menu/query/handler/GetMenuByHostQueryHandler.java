package org.food.host.system.application.domain.menu.query.handler;

import lombok.extern.slf4j.Slf4j;
import org.food.host.system.application.domain.menu.dto.GetMenuByHostResponseDTO;
import org.food.host.system.application.domain.menu.dto.MenuDTO;
import org.food.host.system.application.domain.menu.mapper.MenuDataMapper;
import org.food.host.system.application.domain.menu.ports.output.repository.MenuRepository;
import org.food.host.system.application.domain.menu.query.query.GetMenuByHostQuery;
import org.food.host.system.domain.common.valueobject.HostId;
import org.food.host.system.domain.menu.entity.Menu;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Component
public class GetMenuByHostQueryHandler {
    private final MenuRepository menuRepository;
    private final MenuDataMapper menuDataMapper;

    public GetMenuByHostQueryHandler(MenuRepository menuRepository, MenuDataMapper menuDataMapper) {
        this.menuRepository = menuRepository;
        this.menuDataMapper = menuDataMapper;
    }

    @Transactional(readOnly = true)
    public GetMenuByHostResponseDTO getMenuByHost(GetMenuByHostQuery getMenuByHostQuery) {
        List<Menu> menus = menuRepository.getMenuByHost(new HostId(getMenuByHostQuery.getHostId()));
        List<MenuDTO> mappedMenus = menus.stream().map(menuDataMapper::menuToMenuDto).toList();

        return GetMenuByHostResponseDTO.builder().menus(mappedMenus).build();
    }
}
