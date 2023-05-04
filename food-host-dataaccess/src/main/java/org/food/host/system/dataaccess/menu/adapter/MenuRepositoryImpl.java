package org.food.host.system.dataaccess.menu.adapter;

import lombok.extern.slf4j.Slf4j;
import org.food.host.system.application.domain.menu.ports.output.repository.MenuRepository;
import org.food.host.system.dataaccess.menu.entity.MenuEntity;
import org.food.host.system.dataaccess.menu.mapper.MenuDataAccessMapper;
import org.food.host.system.dataaccess.menu.repository.MenuJpaRepository;
import org.food.host.system.domain.common.valueobject.HostId;
import org.food.host.system.domain.menu.entity.Menu;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
@Component
public class MenuRepositoryImpl implements MenuRepository {
    private final MenuJpaRepository menuJpaRepository;
    private final MenuDataAccessMapper menuDataAccessMapper;

    public MenuRepositoryImpl(MenuJpaRepository menuJpaRepository, MenuDataAccessMapper menuDataAccessMapper) {
        this.menuJpaRepository = menuJpaRepository;
        this.menuDataAccessMapper = menuDataAccessMapper;
    }

    @Override
    public void createOrder(Menu menu) {
        MenuEntity menuEntity = menuDataAccessMapper.menuToMenuEntity(menu);
        menuJpaRepository.save(menuEntity);
    }

    @Override
    public List<Menu> getMenuByHost(HostId hostId) {
        List<MenuEntity> menus = menuJpaRepository.findByHostId(hostId.getValue());
        menus.forEach(menu -> log.info("Menu: {} with Menu Id {} found", menu.getName(), menu.getId()));
        return menus.stream().map(menuDataAccessMapper::menuEntityToMenu).collect(Collectors.toList());
    }
}
