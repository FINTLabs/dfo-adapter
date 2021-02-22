package no.fint.dfo.handler.okonomi;

import no.fint.dfo.handler.Handler;
import no.fint.event.model.Event;
import no.fint.model.okonomi.faktura.FakturaActions;
import no.fint.model.resource.FintLinks;

import java.util.Collections;
import java.util.Set;

public class UpdateFakturaHandler implements Handler {
    @Override
    public void accept(Event<FintLinks> fintLinksEvent) {

    }

    @Override
    public Set<String> actions() {
        return Collections.singleton(FakturaActions.UPDATE_FAKTURA.name());
    }
}
