package org.food.host.system.container;

import org.food.host.system.domain.menu.MenuDomainService;
import org.food.host.system.domain.menu.MenuDomainServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public MenuDomainService menuDomainService() {
        return new MenuDomainServiceImpl();
    }
}
