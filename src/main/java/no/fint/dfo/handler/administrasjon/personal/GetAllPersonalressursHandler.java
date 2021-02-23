package no.fint.dfo.handler.administrasjon.personal;

import no.fint.dfo.handler.Handler;
import no.fint.event.model.Event;
import no.fint.event.model.ResponseStatus;
import no.fint.model.administrasjon.personal.PersonalActions;
import no.fint.model.administrasjon.personal.Personalressurs;
import no.fint.model.felles.Person;
import no.fint.model.felles.kompleksedatatyper.Identifikator;
import no.fint.model.felles.kompleksedatatyper.Periode;
import no.fint.model.resource.FintLinks;
import no.fint.model.resource.Link;
import no.fint.model.resource.administrasjon.personal.PersonalressursResource;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Date;
import java.util.Set;

@Service
public class GetAllPersonalressursHandler implements Handler {
    @Override
    public void accept(Event<FintLinks> response) {
        PersonalressursResource personalressursResource = new PersonalressursResource();

        Identifikator ansattnummer = new Identifikator();
        ansattnummer.setIdentifikatorverdi("123456");
        personalressursResource.setAnsattnummer(ansattnummer);

        Identifikator systemId = new Identifikator();
        systemId.setIdentifikatorverdi("61122334455");
        personalressursResource.setSystemId(systemId);

        personalressursResource.setJobbtittel("Rådgiver");
        Periode ansettelsesperiode = new Periode();
        ansettelsesperiode.setStart(new Date());
        personalressursResource.setAnsettelsesperiode(ansettelsesperiode);

        // ink.with(Klassifikasjonssystem.class, "systemid", input.getClassificationSystemId())
        personalressursResource.addPerson(
                Link.with(
                        Person.class,
                        "fodselsnummer",
                        "12345678987")
        );

        response.setData(Collections.singletonList(personalressursResource));
        response.setResponseStatus(ResponseStatus.ACCEPTED);

    }

    @Override
    public Set<String> actions() {
        return Collections.singleton(PersonalActions.GET_ALL_PERSONALRESSURS.name());
    }
}
