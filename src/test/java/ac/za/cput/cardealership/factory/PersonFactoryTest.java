package ac.za.cput.cardealership.factory;

import ac.za.cput.cardealership.domain.Person;
import org.junit.Assert;
import org.junit.Test;

public class PersonFactoryTest {

    @Test
    public void getCustomer() {

        String name = "Siphe";
        Person c =PersonFactory.getCustomer(name);
        System.out.println(c);
        Assert.assertNotNull(c.getId());
    }
}