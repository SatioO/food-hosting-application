package org.food.host.system.domain.menu.exception;

public class MenuNotFoundException extends MenuDomainException {

    public MenuNotFoundException(String message) {
        super(message);
    }

    public MenuNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
