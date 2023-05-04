package org.food.host.system.domain.menu.entity;

import org.food.host.system.domain.common.entity.BaseEntity;
import org.food.host.system.domain.menu.valueobject.CategoryId;

public class Category extends BaseEntity<CategoryId> {
    private final String name;

    public Category(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
