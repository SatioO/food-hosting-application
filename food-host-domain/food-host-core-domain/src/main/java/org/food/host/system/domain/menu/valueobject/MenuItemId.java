package org.food.host.system.domain.menu.valueobject;

import org.food.host.system.domain.common.valueobject.BaseId;

import java.util.UUID;

public class MenuItemId extends BaseId<UUID> {
    public MenuItemId(UUID id) {
        super(id);
    }
}
