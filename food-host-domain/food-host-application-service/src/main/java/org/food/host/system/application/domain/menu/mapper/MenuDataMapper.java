package org.food.host.system.application.domain.menu.mapper;

import lombok.extern.slf4j.Slf4j;
import org.food.host.system.application.domain.menu.command.command.CreateMenuCommand;
import org.food.host.system.application.domain.menu.dto.MenuDTO;
import org.food.host.system.application.domain.menu.dto.MenuItemDTO;
import org.food.host.system.domain.common.valueobject.HostId;
import org.food.host.system.domain.menu.entity.Category;
import org.food.host.system.domain.menu.entity.Menu;
import org.food.host.system.domain.menu.entity.MenuItem;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

@Slf4j
@Component
public class MenuDataMapper {
    public Menu createMenuCommandToMenu(CreateMenuCommand createMenuCommand) {

        return Menu.builder()
                .hostId(new HostId(createMenuCommand.getHostId()))
                .name(createMenuCommand.getName())
                .menuItems(menuItemsToMenuItemEntities(createMenuCommand.getMenuItems()))
                .build();
    }

    private Set<MenuItem> menuItemsToMenuItemEntities(Set<MenuItemDTO> items) {
        return items.stream()
                .map(item -> MenuItem.builder()
                        .name(item.getName())
                        .price(item.getPrice())
                        .category(new Category(item.getCategory()))
                        .build())
                .collect(Collectors.toSet());
    }

    public MenuDTO menuToMenuDto(Menu menu) {
        return MenuDTO.builder()
                .id(menu.getId().getValue())
                .hostId(menu.getHostId().getValue())
                .name(menu.getName())
                .menuItems(menuItemsToMenuItemDTO(menu.getMenuItems()))
                .build();
    }

    private Set<MenuItemDTO> menuItemsToMenuItemDTO(Set<MenuItem> items) {
        return items.stream()
                .map(item -> MenuItemDTO.builder()
                        .name(item.getName())
                        .price(item.getPrice())
                        .category(item.getCategory().getName())
                        .build())
                .collect(Collectors.toSet());
    }
}
