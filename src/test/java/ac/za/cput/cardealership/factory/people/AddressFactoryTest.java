package ac.za.cput.cardealership.factory.people;

import ac.za.cput.cardealership.domain.people.Address;
import ac.za.cput.cardealership.factory.people.AddressFactory;
import org.junit.Assert;
import org.junit.Test;

public class AddressFactoryTest {

    @Test
    public void getAddress() {

        String street = "long street";
        Address c = AddressFactory.getAddress(street);
        System.out.println(c);
        Assert.assertNotNull(c.getNumber());
    }
}