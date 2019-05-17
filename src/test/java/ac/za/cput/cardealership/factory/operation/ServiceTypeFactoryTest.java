package ac.za.cput.cardealership.factory.operation;

import ac.za.cput.cardealership.domain.operation.ServiceType;
import ac.za.cput.cardealership.factory.operation.ServiceTypeFactory;
import org.junit.Assert;
import org.junit.Test;

public class ServiceTypeFactoryTest {

    @Test
    public void getServiceType() {

        String desc = "Engine service";
        double lbcost = 2000.00;
        ServiceType s = ServiceTypeFactory.getServiceType(desc,lbcost);
        System.out.println(s);
        Assert.assertNotNull(s.getDescription());
    }
}