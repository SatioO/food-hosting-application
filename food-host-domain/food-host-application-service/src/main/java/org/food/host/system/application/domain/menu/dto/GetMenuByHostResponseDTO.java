package org.food.host.system.application.domain.menu.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
@Builder
public class GetMenuByHostResponseDTO {
    private List<MenuDTO> menus;
}
