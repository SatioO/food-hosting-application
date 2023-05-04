package org.food.host.system.domain.dinner.valueobject;

import org.food.host.system.domain.common.valueobject.BaseId;

import java.util.UUID;

public class ReservationId extends BaseId<UUID> {
    public ReservationId(UUID id) {
        super(id);
    }
}
