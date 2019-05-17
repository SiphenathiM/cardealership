package ac.za.cput.cardealership.factory.vihacle;

import ac.za.cput.cardealership.domain.vehicle.Car;
import ac.za.cput.cardealership.factory.vihacle.CarFactory;
import org.junit.Assert;
import org.junit.Test;

public class CarFactoryTest {

    @Test
    public void getCar() {


        String srsNumber = "134678";
        Car c = CarFactory.getCar(srsNumber);
        System.out.println(c);
        Assert.assertNotNull(c.getCarID());
    }
}