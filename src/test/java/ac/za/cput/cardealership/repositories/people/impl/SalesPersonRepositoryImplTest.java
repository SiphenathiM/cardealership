package ac.za.cput.cardealership.repositories.people.impl;

import ac.za.cput.cardealership.domain.people.Person;
import ac.za.cput.cardealership.domain.people.Salesperson;
import ac.za.cput.cardealership.factory.people.PersonFactory;
import ac.za.cput.cardealership.factory.people.SalespersonFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class SalesPersonRepositoryImplTest {



    private SalesPersonRepositoryImpl repository;
    private Salesperson salesperson;



    @Before
    public void setUp() throws Exception {

        this.repository= (SalesPersonRepositoryImpl) SalesPersonRepositoryImpl.getRepository();
        this.salesperson = SalespersonFactory.getSalesperson(2500.00,"junior");
    }

    @Test
    public void getAll() {
        Set<Salesperson> check = this.repository.getAll();
        System.out.println("In get all," + check);
    }

    @Test
    public void create() {

        Person created = this.repository.create(this.salesperson);
        System.out.println("the create, done =" + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.salesperson);
    }

    @Test(expected = AssertionError.class)
    public void update() {

        String newChechId = "002345";
        Salesperson updated = new Salesperson.Builder().position(newChechId).build();
        System.out.println("the update, done = " + updated );
        this.repository.update(updated);
        Assert.assertSame(newChechId,updated.getPosition());
    }



    @Test(expected=AssertionError.class)
    public void read() {

        Person read = this.repository.read(salesperson.getPosition());
        System.out.println("the read, read = " + read);
        getAll();
        Assert.assertSame(read,salesperson);
    }
}