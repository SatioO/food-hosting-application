package org.food.host.system.application.domain.menu.ports.output.repository;

import org.food.host.system.domain.common.valueobject.HostId;
import org.food.host.system.domain.menu.entity.Menu;

import java.util.List;
import java.util.Optional;

public interface MenuRepository {
    void createOrder(Menu menu);

    List<Menu> getMenuByHost(HostId hostId);
}
