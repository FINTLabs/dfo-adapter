package no.fint.dfo.handler.administrasjon.personal;

import no.fint.dfo.handler.Handler;
import no.fint.event.model.Event;
import no.fint.model.administrasjon.personal.PersonalActions;
import no.fint.model.resource.FintLinks;

import java.util.Collections;
import java.util.Set;

public class GetAllArbeidsforholdHandler implements Handler {
    @Override
    public void accept(Event<FintLinks> fintLinksEvent) {

    }

    @Override
    public Set<String> actions() {
        return Collections.singleton(PersonalActions.GET_ALL_ARBEIDSFORHOLD.name());
    }
}
