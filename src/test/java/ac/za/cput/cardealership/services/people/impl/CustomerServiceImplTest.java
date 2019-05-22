package ac.za.cput.cardealership.services.people.impl;

import ac.za.cput.cardealership.domain.people.City;
import ac.za.cput.cardealership.domain.people.Customer;
import ac.za.cput.cardealership.factory.people.CityFactory;
import ac.za.cput.cardealership.factory.people.CustomerFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class CustomerServiceImplTest {

    private CustomerServiceImpl repository;
    private Customer customer;



    @Before
    public void setUp() throws Exception {

        this.repository= (CustomerServiceImpl) CustomerServiceImpl.getRepository();
        this.customer= CustomerFactory.getCustomer(30000,"internal");
    }

    @Test
    public void getAll() {
        Set<Customer> check = this.repository.getAll();
        System.out.println("In get all," + check);
    }

    @Test
    public void create() {

        Customer created = this.repository.create(this.customer);
        System.out.println("the create, done =" + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.customer);
    }

    @Test
    public void update() {

        String newChechId = "002345";
        Customer updated = new Customer.Builder().type(newChechId).build();
        System.out.println("the update, done = " + updated );
        this.repository.update(updated);
        Assert.assertSame(newChechId,updated.getType());
    }

    @Test
    public void delete() {
        this.repository.delete(customer.getType());
        getAll();
    }

    @Test
    public void read() {

        Customer read = this.repository.read(customer.getType());
        System.out.println("the read, read = " + read);
        getAll();
        Assert.assertSame(read,customer);
    }
}