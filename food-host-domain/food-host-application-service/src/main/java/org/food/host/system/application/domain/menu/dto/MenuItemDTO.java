package org.food.host.system.application.domain.menu.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
@Builder
public class MenuItemDTO {
    @NotNull
    @NotEmpty
    private String name;

    @NotNull
    @Min(0)
    private BigDecimal price;

    @NotNull
    private String category;
}
