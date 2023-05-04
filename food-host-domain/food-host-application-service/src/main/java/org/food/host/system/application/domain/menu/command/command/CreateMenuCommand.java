package org.food.host.system.application.domain.menu.command.command;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.food.host.system.application.domain.menu.dto.MenuItemDTO;

import java.util.Set;
import java.util.UUID;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateMenuCommand {
    @NotNull
    private UUID hostId;

    @NotNull
    @NotBlank
    private String name;

    @NotNull
    private Set<MenuItemDTO> menuItemDTOS;
}
