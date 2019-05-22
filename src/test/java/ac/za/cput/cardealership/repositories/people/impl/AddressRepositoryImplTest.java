package ac.za.cput.cardealership.repositories.people.impl;

import ac.za.cput.cardealership.domain.people.Address;
import ac.za.cput.cardealership.domain.people.City;
import ac.za.cput.cardealership.factory.people.AddressFactory;
import ac.za.cput.cardealership.factory.people.CityFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class AddressRepositoryImplTest {

    private AddressRepositoryImpl repository;
    private Address address;



    @Before
    public void setUp() throws Exception {

        this.repository= (AddressRepositoryImpl) AddressRepositoryImpl.getRepository();
        this.address= AddressFactory.getAddress("plain");
    }

    @Test
    public void getAll() {
        Set<Address> check = this.repository.getAll();
        System.out.println("In get all," + check);
    }

    @Test
    public void create() {

        Address created = this.repository.create(this.address);
        System.out.println("the create, done =" + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.address);
    }

    @Test
    public void update() {

        String newChechId = "002345";
        Address updated = new  Address.Builder().number(newChechId).build();
        System.out.println("the update, done = " + updated );
        this.repository.update(updated);
        Assert.assertSame(newChechId,updated.getNumber());
    }

    @Test
    public void delete() {
        this.repository.delete(address.getNumber());
        getAll();
    }

    @Test(expected = AssertionError.class)
    public void read() {

        Address read = this.repository.read(address.getNumber());
        System.out.println("the read, read = " + read);
        getAll();
        Assert.assertSame(read,address.getStreet());
    }
}