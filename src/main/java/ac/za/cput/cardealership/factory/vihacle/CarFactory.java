package ac.za.cput.cardealership.factory.vihacle;

import ac.za.cput.cardealership.domain.vehicle.Car;
import ac.za.cput.cardealership.util.Misc;

public class CarFactory {

    public static Car getCar(String serialNumber){
        return new Car.Builder().carID(Misc.generatedId())
                .serialNumber(serialNumber)
                .build();
    }
}
