package org.food.host.system.domain.menu;

import lombok.extern.slf4j.Slf4j;
import org.food.host.system.domain.menu.entity.Menu;
import org.food.host.system.domain.menu.entity.MenuItem;
import org.food.host.system.domain.menu.event.MenuCreatedEvent;
import org.food.host.system.domain.menu.event.MenuItemAddedEvent;
import org.food.host.system.domain.menu.event.MenuItemRemovedEvent;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.food.host.system.domain.common.DomainConstants.UTC;

@Slf4j
public class MenuDomainServiceImpl implements MenuDomainService {
    @Override
    public MenuCreatedEvent createMenu(Menu menu) {
        menu.initializeMenu();
        return new MenuCreatedEvent(menu, ZonedDateTime.now(ZoneId.of(UTC)));
    }

    @Override
    public MenuItemAddedEvent addItemToMenu(Menu menu, MenuItem item) {
        menu.addMenuItem(item);
        return new MenuItemAddedEvent(menu, ZonedDateTime.now(ZoneId.of(UTC)));
    }

    @Override
    public MenuItemRemovedEvent removeItemFromMenu(Menu menu, MenuItem item) {
        menu.removeMenuItem(item);
        return new MenuItemRemovedEvent(menu, ZonedDateTime.now(ZoneId.of(UTC)));
    }
}
