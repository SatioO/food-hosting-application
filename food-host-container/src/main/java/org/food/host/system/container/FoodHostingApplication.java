package org.food.host.system.container;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "org.food.host.system.dataaccess")
@EntityScan(basePackages = "org.food.host.system.dataaccess")
@SpringBootApplication(scanBasePackages = "org.food.host.system")
public class FoodHostingApplication {
    public static void main(String[] args) {
        SpringApplication.run(FoodHostingApplication.class, args);
    }
}
