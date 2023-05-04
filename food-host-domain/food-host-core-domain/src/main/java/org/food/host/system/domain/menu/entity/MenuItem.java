package org.food.host.system.domain.menu.entity;

import org.food.host.system.domain.common.entity.BaseEntity;
import org.food.host.system.domain.common.valueobject.HostId;
import org.food.host.system.domain.common.valueobject.MenuId;
import org.food.host.system.domain.menu.valueobject.MenuItemId;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;

public class MenuItem extends BaseEntity<MenuItemId> {
    private final MenuId menuId;
    private final String name;
    private final BigDecimal price;
    private final Category category;

    public void initializeMenuItem() {
        setId(new MenuItemId(UUID.randomUUID()));
    }

    private MenuItem(Builder builder) {
        setId(builder.id);
        menuId = builder.menuId;
        name = builder.name;
        price = builder.price;
        category = builder.category;
    }

    public static Builder builder() {
        return new Builder();
    }

    public MenuId getMenuId() {
        return menuId;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    public static final class Builder {
        private MenuId menuId;
        private MenuItemId id;
        private String name;
        private BigDecimal price;
        private Category category;



        private Builder() {
        }

        public Builder id(MenuItemId val) {
            id = val;
            return this;
        }

        public Builder menuId(MenuId val) {
            menuId = val;
            return this;
        }

        public Builder name(String val) {
            name = val;
            return this;
        }

        public Builder price(BigDecimal val) {
            price = val;
            return this;
        }

        public Builder category(Category val) {
            category = val;
            return this;
        }

        public MenuItem build() {
            return new MenuItem(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MenuItem menuItem = (MenuItem) o;
        return Objects.equals(super.getId(), menuItem.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), super.getId());
    }
}
