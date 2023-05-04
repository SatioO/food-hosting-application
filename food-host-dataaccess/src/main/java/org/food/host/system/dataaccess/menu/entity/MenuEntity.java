package org.food.host.system.dataaccess.menu.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "menu")
@Entity
public class MenuEntity {
    @Id
    private UUID id;
    private UUID hostId;
    private String name;

    @OneToMany(mappedBy = "menu", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<MenuItemEntity> menuItems;
}
