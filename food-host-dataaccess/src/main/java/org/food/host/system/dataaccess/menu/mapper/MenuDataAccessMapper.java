package org.food.host.system.dataaccess.menu.mapper;

import org.food.host.system.dataaccess.menu.entity.MenuEntity;
import org.food.host.system.dataaccess.menu.entity.MenuItemEntity;
import org.food.host.system.domain.common.valueobject.HostId;
import org.food.host.system.domain.common.valueobject.MenuId;
import org.food.host.system.domain.menu.entity.Category;
import org.food.host.system.domain.menu.entity.Menu;
import org.food.host.system.domain.menu.entity.MenuItem;
import org.food.host.system.domain.menu.valueobject.MenuItemId;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

@Component
public class MenuDataAccessMapper {
    public MenuEntity menuToMenuEntity(Menu menu) {
        MenuEntity menuEntity = MenuEntity.builder()
                .id(menu.getId().getValue())
                .hostId(menu.getHostId().getValue())
                .name(menu.getName())
                .menuItems(menuItemsToMenuItemEntity(menu.getMenuItems()))
                .build();
        menuEntity.getMenuItems().forEach(menuItem -> menuItem.setMenu(menuEntity));
        return menuEntity;
    }

    public Menu menuEntityToMenu(MenuEntity menuEntity) {
        return Menu.builder()
                .id(new MenuId(menuEntity.getId()))
                .name(menuEntity.getName())
                .hostId(new HostId(menuEntity.getHostId()))
                .menuItems(menuItemEntityToMenuItem(menuEntity.getMenuItems()))
                .build();
    }

    private Set<MenuItemEntity> menuItemsToMenuItemEntity(Set<MenuItem> menuItems) {
        return menuItems.stream()
                .map(menuItem -> MenuItemEntity.builder()
                    .id(menuItem.getId().getValue())
                    .name(menuItem.getName())
                    .price(menuItem.getPrice())
                    .category(menuItem.getCategory().getName())
                    .build())
                .collect(Collectors.toSet());
    }

    private Set<MenuItem> menuItemEntityToMenuItem(Set<MenuItemEntity> menuItems) {
        return menuItems.stream()
                .map(menuItem -> MenuItem.builder()
                        .id(new MenuItemId(menuItem.getId()))
                        .name(menuItem.getName())
                        .price(menuItem.getPrice())
                        .category(new Category(menuItem.getCategory()))
                        .build())
                .collect(Collectors.toSet());
    }
}
