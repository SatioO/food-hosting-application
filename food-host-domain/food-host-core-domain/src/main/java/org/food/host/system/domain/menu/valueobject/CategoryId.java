package org.food.host.system.domain.menu.valueobject;

import org.food.host.system.domain.common.valueobject.BaseId;

import java.util.UUID;

public class CategoryId extends BaseId<UUID> {
    public CategoryId(UUID id) {
        super(id);
    }
}
