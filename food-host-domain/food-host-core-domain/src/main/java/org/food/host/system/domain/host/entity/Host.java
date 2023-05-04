package org.food.host.system.domain.host.entity;

import org.food.host.system.domain.common.entity.AggregateRoot;
import org.food.host.system.domain.common.valueobject.HostId;
import org.food.host.system.domain.host.valueobject.HostStatus;

public class Host extends AggregateRoot<HostId> {
    private final String name;
    private final Integer phone;
    private final HostStatus status;

    private Host(Builder builder) {
        setId(builder.id);
        name = builder.name;
        phone = builder.phone;
        status = builder.status;
    }

    public String getName() {
        return name;
    }

    public Integer getPhone() {
        return phone;
    }

    public HostStatus getStatus() {
        return status;
    }

    public static final class Builder {
        private HostId id;
        private String name;
        private Integer phone;
        private HostStatus status;

        private Builder() {
        }

        public static Builder builder() {
            return new Builder();
        }

        public Builder id(HostId val) {
            id = val;
            return this;
        }

        public Builder name(String val) {
            name = val;
            return this;
        }

        public Builder phone(Integer val) {
            phone = val;
            return this;
        }

        public Builder status(HostStatus val) {
            status = val;
            return this;
        }

        public Host build() {
            return new Host(this);
        }
    }
}
