package it.avanscoperta.cookingevent.menu.builders;

import it.avanscoperta.cookingevent.menu.domain.MenuCreato;
import it.avanscoperta.cookingevent.menu.domain.MenuId;
import it.avanscoperta.cookingevent.user.builders.UserBuilder;
import it.avanscoperta.cookingevent.user.domain.User;

public class MenuBuilder {

    MenuId menuId = MenuId.generate();
    String titolo = "menu di test";
    User user = new UserBuilder().build();

    public MenuCreato build() {
        return new MenuCreato(
                menuId, titolo, user
        );
    }
}
