package ac.za.cput.cardealership.factory;

import ac.za.cput.cardealership.domain.Address;
import ac.za.cput.cardealership.domain.Person;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddressFactoryTest {

    @Test
    public void getAddress() {

        String street = "long street";
        Address c =AddressFactory.getAddress(street);
        System.out.println(c);
        Assert.assertNotNull(c.getNumber());
    }
}