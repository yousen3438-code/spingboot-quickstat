package org.example.spingbootquickstat.controller;

import org.example.spingbootquickstat.Service.PersonService;
import org.example.spingbootquickstat.dao.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    public List<Person> searchByName(@RequestParam String name) {
        System.out.println("发送成功！");
        return personService.searchByName(name);
    }
}
