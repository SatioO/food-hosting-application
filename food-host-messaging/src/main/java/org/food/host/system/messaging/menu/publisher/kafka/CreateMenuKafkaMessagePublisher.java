package org.food.host.system.messaging.menu.publisher.kafka;

import lombok.extern.slf4j.Slf4j;
import org.apache.avro.specific.SpecificRecordBase;
import org.food.host.system.application.domain.config.FoodHostConfigData;
import org.food.host.system.application.domain.menu.ports.output.message.MenuCreatedMessagePublisher;
import org.food.host.system.domain.menu.event.MenuCreatedEvent;
import org.food.host.system.kafka.menu.avro.model.MenuCreatedAvroModel;
import org.food.host.system.messaging.menu.mapper.MenuMessagingDataMapper;
import org.food.host.system.producer.KafkaProducer;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CreateMenuKafkaMessagePublisher implements MenuCreatedMessagePublisher {
    private final MenuMessagingDataMapper menuMessagingDataMapper;
    private final KafkaProducer<String, SpecificRecordBase> kafkaProducer;
    private final FoodHostConfigData foodHostConfigData;

    public CreateMenuKafkaMessagePublisher(MenuMessagingDataMapper menuMessagingDataMapper, KafkaProducer<String, SpecificRecordBase> kafkaProducer, FoodHostConfigData foodHostConfigData) {
        this.menuMessagingDataMapper = menuMessagingDataMapper;
        this.kafkaProducer = kafkaProducer;
        this.foodHostConfigData = foodHostConfigData;
    }

    @Override
    public void publish(MenuCreatedEvent domainEvent) {
        String menuId = domainEvent.getMenu().getId().getValue().toString();
        log.info("publishing menu created event for menu: {}", domainEvent.getMenu().getName());
        MenuCreatedAvroModel menuCreatedAvroModel = menuMessagingDataMapper.menuCreatedEventToMenuCreatedAvroModel(domainEvent);
        kafkaProducer.send(foodHostConfigData.getMenuCreatedTopicName(), menuId, menuCreatedAvroModel);
    }
}
