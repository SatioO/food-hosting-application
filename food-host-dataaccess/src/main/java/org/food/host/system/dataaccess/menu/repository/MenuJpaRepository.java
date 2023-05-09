package org.food.host.system.dataaccess.menu.repository;

import org.food.host.system.dataaccess.menu.entity.MenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface MenuJpaRepository extends JpaRepository<MenuEntity, UUID> {
    List<MenuEntity> findByHostId(UUID hostId);
}
