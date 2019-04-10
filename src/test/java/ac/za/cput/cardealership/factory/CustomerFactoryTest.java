package ac.za.cput.cardealership.factory;

import ac.za.cput.cardealership.domain.Customer;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerFactoryTest {

    @Test
    public void getCustomer() {

        String name = "Siphe";
        Customer c =CustomerFactory.getCustomer(name);
        System.out.println(c);
        Assert.assertNotNull(c.getId());
    }
}