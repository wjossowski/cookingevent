package it.avanscoperta.cookingevent.menu.domain;

import it.avanscoperta.cookingevent.user.domain.User;

public class MenuCreato {
    private final MenuId menuId;
    private final String titolo;
    private final User user;

    public MenuCreato(MenuId menuId, String titolo, User user) {
        this.menuId = menuId;
        this.titolo = titolo;
        this.user = user;
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
}
