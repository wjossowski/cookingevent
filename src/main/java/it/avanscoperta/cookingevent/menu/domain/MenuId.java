package it.avanscoperta.cookingevent.menu.domain;

import java.util.UUID;

public class MenuId {
    String id;

    public MenuId(String id) {
        this.id = id;
    }

    public static MenuId generate() {
        return new MenuId(UUID.randomUUID().toString());
    }

    public String toString() {
        return id;
    }
}
