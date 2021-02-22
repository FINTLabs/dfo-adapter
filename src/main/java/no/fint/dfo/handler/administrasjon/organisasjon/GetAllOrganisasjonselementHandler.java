package no.fint.dfo.handler.administrasjon.organisasjon;

import no.fint.dfo.handler.Handler;
import no.fint.event.model.Event;
import no.fint.model.administrasjon.organisasjon.OrganisasjonActions;
import no.fint.model.resource.FintLinks;

import java.util.Collections;
import java.util.Set;

public class GetAllOrganisasjonselementHandler implements Handler {
    @Override
    public void accept(Event<FintLinks> fintLinksEvent) {

    }

    @Override
    public Set<String> actions() {
        return Collections.singleton(OrganisasjonActions.GET_ALL_ORGANISASJONSELEMENT.name());
    }
}
