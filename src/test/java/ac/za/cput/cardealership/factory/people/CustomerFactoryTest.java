package ac.za.cput.cardealership.factory.people;

import ac.za.cput.cardealership.domain.people.Customer;
import ac.za.cput.cardealership.factory.people.CustomerFactory;
import org.junit.Assert;
import org.junit.Test;

public class CustomerFactoryTest {

    @Test
    public void getCustomer() {

        int discount = 350;
        String s = "stuff";
        Customer c = CustomerFactory.getCustomer(discount,s);
        System.out.println(c);
        Assert.assertNotNull(c.getDiscount());
    }
}