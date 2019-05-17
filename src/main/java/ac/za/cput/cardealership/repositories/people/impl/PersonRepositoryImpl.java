package ac.za.cput.cardealership.repositories.people.impl;

import ac.za.cput.cardealership.domain.people.Person;
import ac.za.cput.cardealership.repositories.people.PersonRepository;

import java.util.HashMap;
import java.util.Map;

public class PersonRepositoryImpl implements PersonRepository {


    private static PersonRepositoryImpl respository = null;

    private Map<String,Person> personTable;

    private PersonRepositoryImpl() {
        personTable = new HashMap<String, Person>();
    }

    public static PersonRepositoryImpl getInstance(){
        if(respository==null)
            respository = new PersonRepositoryImpl();
        return respository;
    }


    @Override
    public Person create(Person person) {
        personTable.put(person.getId(),person);
        Person savedPerson = personTable.get(person.getId());
        return savedPerson;
    }

    @Override
    public Person read(String id) {
        Person person = personTable.get(id);
        return person;
    }

    @Override
    public Person update(Person person) {
        personTable.put(person.getId(),person);
        Person savedPerson = personTable.get(person.getId());
        return savedPerson;
    }

    @Override
    public void delete(String id) {
        personTable.remove(id);
    }
}
