package it.avanscoperta.cookingevent.menu.domain;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

public class AggiungiRicetta {

    @TargetAggregateIdentifier
    private final MenuId menuId;
    private final Ricetta ricetta;
    private final int perQuanti;

    public AggiungiRicetta(MenuId menuId, Ricetta ricetta, int perQuanti) {

        this.menuId = menuId;
        this.ricetta = ricetta;
        this.perQuanti = perQuanti;
    }

    public MenuId getMenuId() {
        return menuId;
    }

    public Ricetta getRicetta() {
        return ricetta;
    }

    public int getPerQuanti() {
        return perQuanti;
    }
}
