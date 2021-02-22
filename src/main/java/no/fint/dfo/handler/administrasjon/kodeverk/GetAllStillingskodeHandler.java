package no.fint.dfo.handler.administrasjon.kodeverk;

import no.fint.dfo.handler.Handler;
import no.fint.event.model.Event;
import no.fint.model.administrasjon.kodeverk.KodeverkActions;
import no.fint.model.resource.FintLinks;

import java.util.Collections;
import java.util.Set;

public class GetAllStillingskodeHandler implements Handler {
    @Override
    public void accept(Event<FintLinks> fintLinksEvent) {

    }

    @Override
    public Set<String> actions() {
        return Collections.singleton(KodeverkActions.GET_ALL_STILLINGSKODE.name());
    }
}
