package org.example.spingbootquickstat.ServiceImpl;

import org.example.spingbootquickstat.Mapper.PersonMapper;
import org.example.spingbootquickstat.Service.PersonService;
import org.example.spingbootquickstat.entity.Person;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonServiceImpl implements PersonService {
    private final PersonMapper personMapper;

    public PersonServiceImpl(PersonMapper personMapper) {
        this.personMapper = personMapper;
    }

    @Override
    public List<Person> getAllPersons() {
        return personMapper.findAll();
    }

    @Override
    public Person getPersonById(Integer id) {
        return personMapper.findById(id);
    }

    @Override
    public List<Person> searchByName(String name) {
        return personMapper.findByName(name);
    }
}
