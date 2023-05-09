package org.food.host.system.messaging.menu.mapper;

import org.food.host.system.domain.menu.entity.Menu;
import org.food.host.system.domain.menu.event.MenuCreatedEvent;
import org.food.host.system.kafka.menu.avro.model.MenuCreatedAvroModel;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class MenuMessagingDataMapper {
    public MenuCreatedAvroModel menuCreatedEventToMenuCreatedAvroModel(MenuCreatedEvent menuCreatedEvent) {
        Menu menu = menuCreatedEvent.getMenu();
        return MenuCreatedAvroModel.newBuilder()
                .setId(UUID.randomUUID())
                .setSagaId(UUID.randomUUID())
                .setName(menu.getName())
                .setHostId(menu.getHostId().getValue())
                .build();
    }
}
