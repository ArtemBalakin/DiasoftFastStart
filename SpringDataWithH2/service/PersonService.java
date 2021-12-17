package application.service;

import application.entity.Person;
import application.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;

    public Person getPersonById(long id) {
        return personRepository.getById(id);
    }

    public void deletePersonById(long id) {
        personRepository.deleteById(id);
    }


    public void deletePerson(Person person) {
        personRepository.delete(person);
    }


    public Person addPerson(Person person) {
        return personRepository.save(person);
    }

    public List<Person> findByFullNameLike(String name) {
        return personRepository.findByFullNameLike(name);
    }
}
