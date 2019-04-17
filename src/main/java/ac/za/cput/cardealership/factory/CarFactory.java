package ac.za.cput.cardealership.factory;

import ac.za.cput.cardealership.domain.Address;
import ac.za.cput.cardealership.domain.Car;
import ac.za.cput.cardealership.util.AdressNo;
import ac.za.cput.cardealership.util.CarGen;

public class CarFactory {

    public static Car getCar(String serialNumber){
        return new Car.Builder().carID(CarGen.generatedId())
                .serialNumber(serialNumber)
                .build();
    }
}
