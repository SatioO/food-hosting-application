package org.food.host.system.application.domain.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "food-service")
public class FoodHostConfigData {
    private String menuCreatedTopicName;
}