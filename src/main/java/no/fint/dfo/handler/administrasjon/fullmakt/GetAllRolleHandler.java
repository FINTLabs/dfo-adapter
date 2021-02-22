package no.fint.dfo.handler.administrasjon.fullmakt;

import no.fint.dfo.handler.Handler;
import no.fint.event.model.Event;
import no.fint.model.administrasjon.fullmakt.FullmaktActions;
import no.fint.model.resource.FintLinks;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Set;

@Service
public class GetAllRolleHandler implements Handler {
    @Override
    public void accept(Event<FintLinks> fintLinksEvent) {

    }

    @Override
    public Set<String> actions() {
        return Collections.singleton(FullmaktActions.GET_ALL_ROLLE.name());
    }
}
