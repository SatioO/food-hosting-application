package org.food.host.system.domain.menu.exception;

public class MenuDomainException extends RuntimeException {
    public MenuDomainException(String message) {
        super(message);
    }

    public MenuDomainException(String message, Throwable cause) {
        super(message, cause);
    }
}
