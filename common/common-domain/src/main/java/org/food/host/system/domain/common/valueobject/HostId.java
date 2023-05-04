package org.food.host.system.domain.common.valueobject;

import org.food.host.system.domain.common.valueobject.BaseId;

import java.util.UUID;

public class HostId extends BaseId<UUID> {
    public HostId(UUID id) {
        super(id);
    }
}
