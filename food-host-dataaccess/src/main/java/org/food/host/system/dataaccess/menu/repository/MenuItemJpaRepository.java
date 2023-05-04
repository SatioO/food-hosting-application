package org.food.host.system.dataaccess.menu.repository;

import org.food.host.system.dataaccess.menu.entity.MenuItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MenuItemJpaRepository extends JpaRepository<MenuItemEntity, UUID> {
}
