package no.fint.dfo.handler.felles;

import no.fint.dfo.handler.Handler;
import no.fint.event.model.Event;
import no.fint.model.felles.FellesActions;
import no.fint.model.resource.FintLinks;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Set;

@Service
public class GetAllPersonHandler implements Handler {
    @Override
    public void accept(Event<FintLinks> fintLinksEvent) {

    }

    @Override
    public Set<String> actions() {
        return Collections.singleton(FellesActions.GET_ALL_PERSON.name());
    }
}
