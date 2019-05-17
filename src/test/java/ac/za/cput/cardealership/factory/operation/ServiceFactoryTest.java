package ac.za.cput.cardealership.factory.operation;

import ac.za.cput.cardealership.domain.operation.Service;
import ac.za.cput.cardealership.factory.operation.ServiceFactory;
import org.junit.Assert;
import org.junit.Test;

public class ServiceFactoryTest {

    @Test
    public void getService() {
        String name = "Siphe";
        double hrRate = 200.00;
        Service c = ServiceFactory.getService(name,hrRate);
        System.out.println(c);
        Assert.assertNotNull(c.getHourlyRate());
    }
}