package ac.za.cput.cardealership.repositories.people.impl;

import ac.za.cput.cardealership.domain.people.Mechanic;
import ac.za.cput.cardealership.factory.people.MechanicFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MechanicRepositoryImplTest {

    private MechanicRepositoryImpl repository;
    private Mechanic mechanic;



    @Before
    public void setUp() throws Exception {

        this.repository= (MechanicRepositoryImpl) MechanicRepositoryImpl.getRepository();
        this.mechanic = MechanicFactory.getMechanic("Mike","Ross");
    }

    @Test
    public void getAll() {
        Set<Mechanic> check = this.repository.getAll();
        System.out.println("In get all," + check);
    }

    @Test
    public void create() {

        Mechanic created = this.repository.create(this.mechanic);
        System.out.println("the create, done =" + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.mechanic);
    }

    @Test
    public void update() {

        String newChechId = "002345";
        Mechanic updated = new Mechanic.Builder().mechanicID(newChechId).build();
        System.out.println("the update, done = " + updated );
        this.repository.update(updated);
        Assert.assertSame(newChechId,updated.getMechanicID());
    }

    @Test
    public void delete() {
        this.repository.delete(mechanic.getMechanicID());
        getAll();
    }

    @Test
    public void read() {

        Mechanic read = this.repository.read(mechanic.getMechanicID());
        System.out.println("the read, read = " + read);
        getAll();
        Assert.assertSame(read,mechanic);
    }
}