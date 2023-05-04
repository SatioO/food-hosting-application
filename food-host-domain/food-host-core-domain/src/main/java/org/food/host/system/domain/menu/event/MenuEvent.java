package org.food.host.system.domain.menu.event;

import org.food.host.system.domain.common.event.DomainEvent;
import org.food.host.system.domain.menu.entity.Menu;

import java.time.ZonedDateTime;

public class MenuEvent implements DomainEvent<Menu> {
    private final Menu menu;
    private final ZonedDateTime createdAt;

    public MenuEvent(Menu menu, ZonedDateTime createdAt) {
        this.menu = menu;
        this.createdAt = createdAt;
    }

    public Menu getMenu() {
        return menu;
    }

    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }
}
