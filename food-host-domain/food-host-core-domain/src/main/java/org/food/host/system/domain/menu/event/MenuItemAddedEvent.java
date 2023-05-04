package org.food.host.system.domain.menu.event;

import org.food.host.system.domain.menu.entity.Menu;

import java.time.ZonedDateTime;

public class MenuItemAddedEvent extends MenuEvent {
    public MenuItemAddedEvent(Menu menu, ZonedDateTime createdAt) {
        super(menu, createdAt);
    }
}
