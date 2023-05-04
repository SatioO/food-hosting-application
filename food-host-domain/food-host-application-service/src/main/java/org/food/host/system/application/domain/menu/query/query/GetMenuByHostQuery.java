package org.food.host.system.application.domain.menu.query.query;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.UUID;
@Getter
@Builder
@AllArgsConstructor
public class GetMenuByHostQuery {
    private UUID hostId;
}
