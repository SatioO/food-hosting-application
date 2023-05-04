package org.food.host.system.dataaccess.menu.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "menu_item")
@Entity
public class MenuItemEntity {
    @Id
    private UUID id;
    private String name;
    private BigDecimal price;
    private String category;

    @ManyToOne
    @JoinColumn(name = "MENU_ID")
    private MenuEntity menu;
}
