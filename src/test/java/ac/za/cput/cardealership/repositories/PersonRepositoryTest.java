package ac.za.cput.cardealership.repositories;

import ac.za.cput.cardealership.domain.people.Person;
import ac.za.cput.cardealership.factory.people.PersonFactory;
import ac.za.cput.cardealership.repositories.people.impl.PersonRepositoryImpl;
import ac.za.cput.cardealership.repositories.people.PersonRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class PersonRepositoryTest {
    Map<String,String> values;
    PersonRepository repository;

   @Before
    public void setUp() throws Exception {
        repository = PersonRepositoryImpl.getInstance();
        values = new HashMap<String,String>();
        values.put("id","1");
        values.put("firstname","Mike");
        values.put("lastname","Ross");
        values.put("phoneNumber","07879842341");

    }

    @Test
    public void create() throws Exception {
        Person person = PersonFactory.getPerson(values,"0847204834");
        repository.create(person);
        assertEquals("0847204834",person.getPhoneNumber());
    }

    @Test//(dependsOnMethods = "create")
    public void read() throws Exception {
        Person readperson = repository.read("1");
        assertEquals("0847204834",readperson.getPhoneNumber());
    }

    @Test//(dependsOnMethods = "read")
    public void update() throws Exception {
        Person person = repository.read("1");
        Person newPerson = new Person.Builder()
                .phoneNumber(values.get("0747204834"))
                .firstname(values.get("firstname"))
                .lastname(values.get("lastname"))
                .id(values.get("id"))
                .build();
        repository.update(newPerson);
        Person UpdatePerson = repository.read("1");
        Assert.assertEquals("0747204834",UpdatePerson.getPhoneNumber());
    }

    @Test //(dependsOnMethods = "update")
    public void delete() throws Exception {
        repository.delete("1");
        Person person = repository.read("1");
        assertNull(person);
    }
}