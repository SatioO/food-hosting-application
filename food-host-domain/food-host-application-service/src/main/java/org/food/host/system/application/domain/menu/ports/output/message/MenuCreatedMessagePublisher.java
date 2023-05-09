package org.food.host.system.application.domain.menu.ports.output.message;

import org.food.host.system.domain.common.event.publisher.DomainEventPublisher;
import org.food.host.system.domain.menu.event.MenuCreatedEvent;

public interface MenuCreatedMessagePublisher extends DomainEventPublisher<MenuCreatedEvent> {
}
