package it.avanscoperta.cookingevent.menu.query;

import it.avanscoperta.cookingevent.menu.domain.MenuCreato;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;


@Component
public class MenuSummaryProjection {

    final MenuSummaryViewRepository repository;

    public MenuSummaryProjection(MenuSummaryViewRepository repository) {
        this.repository = repository;
    }

    public void on(MenuCreato event) {
        MenuSummaryView view = new MenuSummaryView(
                event.getMenuId().toString(),
                event.getTitolo(),
                event.getUser(),
                event.getPortate()
        );

        repository.save(view);
    }

    public Optional<MenuSummaryView> find(String id) {
        return repository.findById(id);
    }
}
