package org.food.host.system.application.domain.menu.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.Set;
import java.util.UUID;

@Getter
@AllArgsConstructor
@Builder
public class MenuDTO {
    private UUID id;
    private UUID hostId;
    private String name;
    private Set<MenuItemDTO> menuItems;
}
