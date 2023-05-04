package org.food.host.system.domain.menu.entity;

import org.food.host.system.domain.common.entity.AggregateRoot;
import org.food.host.system.domain.common.valueobject.HostId;
import org.food.host.system.domain.common.valueobject.MenuId;
import org.food.host.system.domain.menu.exception.MenuDomainException;

import java.math.BigDecimal;
import java.util.Set;
import java.util.UUID;

public class Menu extends AggregateRoot<MenuId> {
    private final String name;
    private final HostId hostId;
    private final Set<MenuItem> menuItems;

    public void initializeMenu() {
        setId(new MenuId(UUID.randomUUID()));
        initializeMenuItems();
    }

    private void initializeMenuItems() {
        menuItems.forEach(MenuItem::initializeMenuItem);
    }

    public void addMenuItem(MenuItem item) {
        if(item.getCategory() == null) {
            throw new MenuDomainException("Menu Item must belong to a category");
        }

        if(menuItems.contains(item)) {
            throw new MenuDomainException("Duplicate Menu Items are not allowed");
        }

        if(item.getPrice().compareTo(BigDecimal.ZERO) < 0) {
            throw new MenuDomainException("Menu Item price can not be negative");
        }

        menuItems.add(item);
    }

    public void removeMenuItem(MenuItem item) {
        if(!menuItems.contains(item)) {
            throw new MenuDomainException("Menu Item is not present in the set");
        }

        menuItems.remove(item);
    }

    private Menu(Builder builder) {
        setId(builder.id);
        name = builder.name;
        hostId = builder.hostId;
        menuItems = builder.menuItems;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getName() {
        return name;
    }

    public HostId getHostId() {
        return hostId;
    }

    public Set<MenuItem> getMenuItems() {
        return menuItems;
    }

    public static final class Builder {
        private MenuId id;
        private String name;
        private HostId hostId;
        private Set<MenuItem> menuItems;

        private Builder() {
        }

        public Builder id(MenuId val) {
            id = val;
            return this;
        }

        public Builder name(String val) {
            name = val;
            return this;
        }

        public Builder hostId(HostId val) {
            hostId = val;
            return this;
        }

        public Builder menuItems(Set<MenuItem> val) {
            menuItems = val;
            return this;
        }

        public Menu build() {
            return new Menu(this);
        }
    }
}
