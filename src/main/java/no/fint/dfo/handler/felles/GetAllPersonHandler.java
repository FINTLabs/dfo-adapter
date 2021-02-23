package no.fint.dfo.handler.felles;

import no.fint.dfo.handler.Handler;
import no.fint.event.model.Event;
import no.fint.event.model.ResponseStatus;
import no.fint.model.administrasjon.personal.Personalressurs;
import no.fint.model.felles.FellesActions;
import no.fint.model.felles.kompleksedatatyper.Identifikator;
import no.fint.model.felles.kompleksedatatyper.Personnavn;
import no.fint.model.resource.FintLinks;
import no.fint.model.resource.Link;
import no.fint.model.resource.felles.PersonResource;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Set;

@Service
public class GetAllPersonHandler implements Handler {
    @Override
    public void accept(Event<FintLinks> response) {

        PersonResource personResource = new PersonResource();

        Identifikator nin = new Identifikator();
        nin.setIdentifikatorverdi("12345678987");
        personResource.setFodselsnummer(nin);

        Personnavn navn = new Personnavn();
        navn.setFornavn("Ole");
        navn.setEtternavn("Olsen");
        personResource.setNavn(navn);

        personResource.addPersonalressurs(Link.with(Personalressurs.class, "ansattnummer", "123456"));
        personResource.addPersonalressurs(Link.with(Personalressurs.class, "systemid", "61122334455"));

        response.setData(Collections.singletonList(personResource));
        response.setResponseStatus(ResponseStatus.ACCEPTED);

    }

    @Override
    public Set<String> actions() {
        return Collections.singleton(FellesActions.GET_ALL_PERSON.name());
    }
}
