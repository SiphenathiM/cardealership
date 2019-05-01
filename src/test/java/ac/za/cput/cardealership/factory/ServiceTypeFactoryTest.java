package ac.za.cput.cardealership.factory;

import ac.za.cput.cardealership.domain.Service;
import ac.za.cput.cardealership.domain.ServiceType;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ServiceTypeFactoryTest {

    @Test
    public void getServiceType() {

        String desc = "Engine service";
        double lbcost = 2000.00;
        ServiceType s =ServiceTypeFactory.getServiceType(desc,lbcost);
        System.out.println(s);
        Assert.assertNotNull(s.getDescription());
    }
}