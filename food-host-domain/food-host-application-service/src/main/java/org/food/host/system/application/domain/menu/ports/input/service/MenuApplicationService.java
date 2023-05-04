package org.food.host.system.application.domain.menu.ports.input.service;

import org.food.host.system.application.domain.menu.command.command.CreateMenuCommand;
import org.food.host.system.application.domain.menu.dto.CreateMenuResponseDTO;
import org.food.host.system.application.domain.menu.dto.GetMenuByHostResponseDTO;
import org.food.host.system.application.domain.menu.query.query.GetMenuByHostQuery;

public interface MenuApplicationService {
    CreateMenuResponseDTO createMenu(CreateMenuCommand createMenuCommand);

    GetMenuByHostResponseDTO getMenuByHost(GetMenuByHostQuery query);
}
