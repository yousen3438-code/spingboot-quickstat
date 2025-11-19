package org.example.spingbootquickstat.controller;

import org.example.spingbootquickstat.Service.PersonService;
import org.example.spingbootquickstat.dao.Person;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }
    @GetMapping("/all_person")
    public List<Person> getAllPersons() {
        System.out.println("获取成功！");
        return personService.getAllPersons();
    }
    @PostMapping("/person_by_name")
    public List<Person> searchByName(@RequestBody Person person) {
        return personService.searchByName(person.getName());
    }
}
