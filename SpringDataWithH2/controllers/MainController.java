package application.controllers;

import application.entity.Person;
import application.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {
    @Autowired
    PersonService service;

    @GetMapping
    @RequestMapping("/getPersonById")
    public Person getPersonById(@RequestParam("id") long id) {
        return service.getPersonById(id);
    }

    @GetMapping
    @RequestMapping("/getPersonByName")
    public List<Person> getPersonsWithName(@RequestParam("name")String name) {
        return service.findByFullNameLike(name);
    }

    @DeleteMapping
    @RequestMapping("/getPersonBy")
    public void deletePersonById(@RequestParam("id")long id) {
        service.deletePersonById(id);
    }

    @DeleteMapping
    @RequestMapping("/deletePerson")
    public void deletePerson(@RequestParam("name")String name) {
        Person person=new Person();
        person.setFullName(name);
        service.deletePerson(person);
    }

    @PostMapping
    @RequestMapping("/addPerson")
    public void addPerson(@RequestParam("name")String name) {
        Person person=new Person();
        person.setFullName(name);
        service.addPerson(person);
    }
}
