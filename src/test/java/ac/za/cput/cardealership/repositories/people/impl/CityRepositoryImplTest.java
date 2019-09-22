package ac.za.cput.cardealership.repositories.people.impl;

import ac.za.cput.cardealership.domain.people.City;
import ac.za.cput.cardealership.domain.people.Mechanic;
import ac.za.cput.cardealership.factory.people.CityFactory;
import ac.za.cput.cardealership.factory.people.MechanicFactory;
import ac.za.cput.cardealership.repositories.people.CityRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class CityRepositoryImplTest {

    private CityRepositoryImpl repository;
    private City city;



    @Before
    public void setUp() throws Exception {

        this.repository= (CityRepositoryImpl) CityRepositoryImpl.getCityRepository();
        this.city= CityFactory.getCity("4478","plain");
    }

    @Test
    public void getAll() {
        Set<City> check = this.repository.getAll();
        System.out.println("In get all," + check);
    }

    @Test
    public void create() {

        City created = this.repository.create(this.city);
        System.out.println("the create, done =" + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.city);
    }

    @Test
    public void update() {

        String newChechId = "002345";
        City updated = new City.Builder().cityZipCode(newChechId).build();
        System.out.println("the update, done = " + updated );
        this.repository.update(updated);
        Assert.assertSame(newChechId,updated.getCityZipCode());
    }

    @Test
    public void delete() {
        this.repository.delete(city.getCityZipCode());
        getAll();
    }

    @Test(expected=AssertionError.class)
    public void read() {

        City read = this.repository.read(city.getCityZipCode());
        System.out.println("the read, read = " + read);
        getAll();
        Assert.assertSame(read,city);
    }
}