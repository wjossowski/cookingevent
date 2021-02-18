package it.avanscoperta.cookingevent.menu.domain;

import it.avanscoperta.cookingevent.user.domain.User;

import java.util.ArrayList;
import java.util.List;

public class MenuCreato {
    private final MenuId menuId;
    private final String titolo;
    private final User user;
    private final List<Portata> portate;

    public MenuCreato(MenuId menuId, String titolo, User user) {
        this.menuId = menuId;
        this.titolo = titolo;
        this.user = user;
        this.portate = new ArrayList<Portata>();
    }

    public MenuId getMenuId() {
        return menuId;
    }

    public String getTitolo() {
        return titolo;
    }

    public User getUser() {
        return user;
    }

    public List<Portata> getPortate() {
        return portate;
    }
}
