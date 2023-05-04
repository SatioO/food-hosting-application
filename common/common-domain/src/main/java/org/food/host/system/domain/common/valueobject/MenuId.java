package org.food.host.system.domain.common.valueobject;

import org.food.host.system.domain.common.valueobject.BaseId;

import java.util.UUID;

public class MenuId extends BaseId<UUID> {
    public MenuId(UUID id) {
        super(id);
    }
}
