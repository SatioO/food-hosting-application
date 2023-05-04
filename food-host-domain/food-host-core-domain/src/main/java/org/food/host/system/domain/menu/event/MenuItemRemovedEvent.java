package org.food.host.system.domain.menu.event;

import org.food.host.system.domain.menu.entity.Menu;

import java.time.ZonedDateTime;

public class MenuItemRemovedEvent extends MenuEvent {
    public MenuItemRemovedEvent(Menu menu, ZonedDateTime createdAt) {
        super(menu, createdAt);
    }
}
