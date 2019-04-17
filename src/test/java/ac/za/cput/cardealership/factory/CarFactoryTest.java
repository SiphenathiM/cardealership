package ac.za.cput.cardealership.factory;

import ac.za.cput.cardealership.domain.Car;
import ac.za.cput.cardealership.domain.Person;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarFactoryTest {

    @Test
    public void getCar() {


        String srsNumber = "134678";
        Car c =CarFactory.getCar(srsNumber);
        System.out.println(c);
        Assert.assertNotNull(c.getCarID());
    }
}