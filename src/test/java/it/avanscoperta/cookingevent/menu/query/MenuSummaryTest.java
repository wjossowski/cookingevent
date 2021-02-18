package it.avanscoperta.cookingevent.menu.query;

import it.avanscoperta.cookingevent.menu.builders.MenuBuilder;
import it.avanscoperta.cookingevent.menu.domain.MenuCreato;
import it.avanscoperta.cookingevent.menu.query.MenuSummaryProjection;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class MenuSummaryTest {


    @Autowired
    MenuSummaryProjection projection;


    @Test
    public void can_save_a_menu() {
        MenuCreato menuCreato = new MenuBuilder().build();

        projection.on(menuCreato);

        Optional<MenuSummaryView> menuSummaryView = projection.find(menuCreato.getMenuId().toString());

        assertTrue(menuSummaryView.isPresent());

    }
}
