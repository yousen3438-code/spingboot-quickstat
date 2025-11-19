package org.example.spingbootquickstat.Service;

import org.example.spingbootquickstat.dao.Person;

import java.util.List;

public interface PersonService {

    List<Person> getAllPersons();

    Person getPersonById(Integer id);

    List<Person> searchByName(String name) ;
}
