package org.example.spingbootquickstat.Service;

import org.example.spingbootquickstat.Mapper.PersonMapper;
import org.example.spingbootquickstat.dao.Person;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private final PersonMapper personMapper;

    public PersonService(PersonMapper personMapper) {
        this.personMapper = personMapper;
    }

    public List<Person> getAllPersons() {
        return personMapper.findAll();
    }

    public Person getPersonById(Integer id) {
        return personMapper.findById(id);
    }

    public List<Person> searchByName(String name) {
        return personMapper.findByName(name);
    }
}
