package it.avanscoperta.cookingevent.menu.domain;

import it.avanscoperta.cookingevent.user.domain.User;
import org.axonframework.test.aggregate.AggregateTestFixture;
import org.axonframework.test.aggregate.FixtureConfiguration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MenuTest {

    FixtureConfiguration fixture = new AggregateTestFixture(Menu.class);

    String titolo;
    User user;
    MenuId menuId;
    CreaMenu creaMenu;
    MenuCreato menuCreato;

    @BeforeEach
    public void setup() {
        titolo = "Digiuno tra amici";
        user = new User();
        menuId = MenuId.generate();

        creaMenu = new CreaMenu(
                menuId, titolo, user
        );
        menuCreato = new MenuCreato(
                menuId, titolo, user
        );
    }

    @Test
    public void creazione_menu_vuoto() {

        fixture.givenNoPriorActivity()
                .when(creaMenu)
                .expectEvents(menuCreato);

    }

    @Test
    public void can_add_recipe() {
        Ricetta ricetta = new Ricetta();

        AggiungiRicetta aggiungiRicetta = new AggiungiRicetta(
                menuId, ricetta, 4
        );
        RicettaAggiunta ricettaAggiunta = new RicettaAggiunta(
                menuId, ricetta, 4
        );

        fixture.given(menuCreato)
                .when(aggiungiRicetta)
                .expectEvents(ricettaAggiunta);
    }


}
