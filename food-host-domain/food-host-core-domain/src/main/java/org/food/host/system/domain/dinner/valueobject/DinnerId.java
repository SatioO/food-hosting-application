package org.food.host.system.domain.dinner.valueobject;

import org.food.host.system.domain.common.valueobject.BaseId;

import java.util.UUID;

public class DinnerId extends BaseId<UUID> {
    public DinnerId(UUID uuid) {
        super(uuid);
    }
}
