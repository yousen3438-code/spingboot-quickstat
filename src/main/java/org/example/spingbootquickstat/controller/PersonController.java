package org.example.spingbootquickstat.controller;

import org.example.spingbootquickstat.Service.PersonService;
import org.example.spingbootquickstat.dao.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }
    @GetMapping("/person")
    public List<Person> getAllPersons() {
        return personService.getAllPersons();
    }
}
