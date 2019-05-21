package ac.za.cput.cardealership.controller;

import ac.za.cput.cardealership.domain.people.Person;
import ac.za.cput.cardealership.factory.people.PersonFactory;
import ac.za.cput.cardealership.repositories.people.PersonRepository;
import ac.za.cput.cardealership.services.people.impl.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/cardealership/person")
public class PersonController {

    @Autowired
    private PersonServiceImpl service;

    @GetMapping("/create/{firstname}")
    public @ResponseBody
    Person create(@PathVariable String name, String last, String phoneNumber) {
        Person person = PersonFactory.getPerson(name,last,phoneNumber);
        return service.create(person);

    }


/*@Controller
class PersonController {
    @RequestMapping("/")
    @ResponseBody
    public String hello() {
       return  "Hello Spring Boot";
    }*/
}