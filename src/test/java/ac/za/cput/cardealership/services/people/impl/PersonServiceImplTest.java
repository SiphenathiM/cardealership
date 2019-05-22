package ac.za.cput.cardealership.services.people.impl;

import ac.za.cput.cardealership.domain.people.City;
import ac.za.cput.cardealership.domain.people.Person;
import ac.za.cput.cardealership.factory.people.CityFactory;
import ac.za.cput.cardealership.factory.people.PersonFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class PersonServiceImplTest {

    private PersonServiceImpl repository;
    private Person person;



    @Before
    public void setUp() throws Exception {

        this.repository= (PersonServiceImpl) PersonServiceImpl.getRepository();
        this.person= PersonFactory.getPerson("siphe","mpe","08452678");
    }

    @Test
    public void getAll() {
        Set<Person> check = this.repository.getAll();
        System.out.println("In get all," + check);
    }

    @Test
    public void create() {

        Person created = this.repository.create(this.person);
        System.out.println("the create, done =" + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.person);
    }

    @Test
    public void update() {

        String newChechId = "002345";
        Person updated = new Person.Builder().id(newChechId).build();
        System.out.println("the update, done = " + updated );
        this.repository.update(updated);
        Assert.assertSame(newChechId,updated.getId());
    }

    @Test
    public void delete() {
        this.repository.delete(person.getId());
        getAll();
    }

    @Test
    public void read() {

        Person read = this.repository.read(person.getId());
        System.out.println("the read, read = " + read);
        getAll();
        Assert.assertSame(read,person);
    }
}