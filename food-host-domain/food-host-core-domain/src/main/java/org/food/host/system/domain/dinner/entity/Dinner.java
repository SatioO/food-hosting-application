package org.food.host.system.domain.dinner.entity;

import org.food.host.system.domain.common.entity.AggregateRoot;
import org.food.host.system.domain.dinner.valueobject.DinnerId;
import org.food.host.system.domain.common.valueobject.HostId;
import org.food.host.system.domain.common.valueobject.MenuId;

import java.util.List;

public class Dinner extends AggregateRoot<DinnerId> {
    private final HostId hostId;
    private final MenuId menuId;
    private final List<Reservation> reservations;

    private Dinner(Builder builder) {
        setId(builder.id);
        hostId = builder.hostId;
        menuId = builder.menuId;
        reservations = builder.reservations;
    }

    public HostId getHostId() {
        return hostId;
    }

    public MenuId getMenuId() {
        return menuId;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public static final class Builder {
        private DinnerId id;
        private HostId hostId;
        private MenuId menuId;
        private List<Reservation> reservations;

        private Builder() {
        }

        public static Builder builder() {
            return new Builder();
        }

        public Builder id(DinnerId val) {
            id = val;
            return this;
        }

        public Builder hostId(HostId val) {
            hostId = val;
            return this;
        }

        public Builder menuId(MenuId val) {
            menuId = val;
            return this;
        }

        public Builder reservations(List<Reservation> val) {
            reservations = val;
            return this;
        }

        public Dinner build() {
            return new Dinner(this);
        }
    }
}
