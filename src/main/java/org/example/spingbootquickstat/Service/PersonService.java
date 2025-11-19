package org.example.spingbootquickstat.Service;

import org.example.spingbootquickstat.Mapper.PersonMapper;
import org.example.spingbootquickstat.dao.Person;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PersonService {

    List<Person> getAllPersons();

    Person getPersonById(Integer id);

    List<Person> searchByName(String name) ;
}
