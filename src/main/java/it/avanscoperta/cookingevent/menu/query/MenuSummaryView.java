package it.avanscoperta.cookingevent.menu.query;

import it.avanscoperta.cookingevent.menu.domain.MenuId;
import it.avanscoperta.cookingevent.menu.domain.Portata;
import it.avanscoperta.cookingevent.user.domain.User;
import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * Questo è ul nostro read model.
 * Ottimizzato per le informazioni che devo poter avere a schermo.
 */
public class MenuSummaryView {
    @Id
    private final String menuId;
    private final String titolo;
    private final User user;
    private final List<Portata> portate;

    public MenuSummaryView(String menuId, String titolo, User user, List<Portata> portate) {
        this.menuId = menuId;
        this.titolo = titolo;
        this.user = user;
        this.portate = portate;
    }
}
