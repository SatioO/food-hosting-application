package org.food.host.system.domain.menu;

import org.food.host.system.domain.menu.entity.Menu;
import org.food.host.system.domain.menu.entity.MenuItem;
import org.food.host.system.domain.menu.event.MenuCreatedEvent;
import org.food.host.system.domain.menu.event.MenuItemAddedEvent;
import org.food.host.system.domain.menu.event.MenuItemRemovedEvent;

public interface MenuDomainService {
    MenuCreatedEvent createMenu(Menu menu);
    MenuItemAddedEvent addItemToMenu(Menu menu, MenuItem item);
    MenuItemRemovedEvent removeItemFromMenu(Menu menu, MenuItem item);
}
