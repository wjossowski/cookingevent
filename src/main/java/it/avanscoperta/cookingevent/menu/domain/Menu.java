package it.avanscoperta.cookingevent.menu.domain;


import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.spring.stereotype.Aggregate;

import static org.axonframework.modelling.command.AggregateLifecycle.apply;

@Aggregate
public class Menu {

    @AggregateIdentifier
    private MenuId menuId;
    private MenuState state;

    private Menu() {}

    @CommandHandler
    public Menu(CreaMenu command) {
        // Guard?
        apply(new MenuCreato(
                command.getMenuId(),
                command.getTitolo(),
                command.getUser()
        ));
    }

    @EventSourcingHandler
    public void on(MenuCreato event) {
        this.menuId = event.getMenuId();
        this.state = MenuState.ACTIVE;
    }

    @CommandHandler
    public void addRecipe(AggiungiRicetta command) {
        // Guard?
        if (state == MenuState.ACTIVE) {
            apply(new RicettaAggiunta(
                    command.getMenuId(),
                    command.getRicetta(),
                    command.getPerQuanti()
            ));
        }

    }


}
