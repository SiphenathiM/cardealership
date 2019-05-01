package ac.za.cput.cardealership.factory;

import ac.za.cput.cardealership.domain.Person;
import ac.za.cput.cardealership.domain.Service;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ServiceFactoryTest {

    @Test
    public void getService() {
        String name = "Siphe";
        double hrRate = 200.00;
        Service c =ServiceFactory.getService(name,hrRate);
        System.out.println(c);
        Assert.assertNotNull(c.getHourlyRate());
    }
}