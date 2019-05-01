package ac.za.cput.cardealership.factory;

import ac.za.cput.cardealership.domain.Car;
import ac.za.cput.cardealership.domain.Customer;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerFactoryTest {

    @Test
    public void getCustomer() {

        int discount = 350;
        String s = "stuff";
        Customer c =CustomerFactory.getCustomer(discount,s);
        System.out.println(c);
        Assert.assertNotNull(c.getDiscount());
    }
}