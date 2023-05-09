package org.food.host.system.domain.common.event.publisher;

import org.food.host.system.domain.common.event.DomainEvent;

public interface DomainEventPublisher<T extends DomainEvent> {
    void publish(T domainEvent);
}
