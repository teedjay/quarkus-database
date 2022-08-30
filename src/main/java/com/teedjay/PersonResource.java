package com.teedjay;

import com.teedjay.PersonMapper.Person;
import org.jboss.resteasy.reactive.RestPath;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;

@Path("/person")
public class PersonResource {

    @Inject
    PersonMapper person;

    @GET
    public List<Person> getAllPersons() {
        return person.all();
    }

    @GET
    @Path("{id}")
    public Person getPersonById(@RestPath Integer id) {
        return person.byId(id);
    }

}
