package no.fint.customcode.handler;

import no.fint.event.model.Event;
import no.fint.model.resource.FintLinks;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class GetAllPersonHandler implements Handler{
    @Override
    public void accept(Event<FintLinks> fintLinksEvent) {

    }

    @Override
    public Set<String> actions() {
        return null;
    }
}
