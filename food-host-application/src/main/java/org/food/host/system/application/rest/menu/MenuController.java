package org.food.host.system.application.rest.menu;

import lombok.extern.slf4j.Slf4j;
import org.food.host.system.application.domain.menu.command.command.CreateMenuCommand;
import org.food.host.system.application.domain.menu.dto.CreateMenuResponseDTO;
import org.food.host.system.application.domain.menu.dto.GetMenuByHostResponseDTO;
import org.food.host.system.application.domain.menu.ports.input.service.MenuApplicationService;
import org.food.host.system.application.domain.menu.query.query.GetMenuByHostQuery;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Slf4j
@RestController
@RequestMapping(value = "/menu")
public class MenuController {
    private final MenuApplicationService menuApplicationService;

    public MenuController(MenuApplicationService menuApplicationService) {
        this.menuApplicationService = menuApplicationService;
    }

    @GetMapping("/{hostId}")
    public ResponseEntity<GetMenuByHostResponseDTO> getMenuByHost(@PathVariable UUID hostId) {
        GetMenuByHostResponseDTO menuByHost = menuApplicationService.getMenuByHost(GetMenuByHostQuery.builder().hostId(hostId).build());
        return ResponseEntity.ok().body(menuByHost);
    }

    @PostMapping
    public ResponseEntity<CreateMenuResponseDTO> createMenu(@RequestBody CreateMenuCommand createMenuCommand) {
        CreateMenuResponseDTO menu = menuApplicationService.createMenu(createMenuCommand);
        return ResponseEntity.status(HttpStatus.CREATED).body(menu);
    }
}
