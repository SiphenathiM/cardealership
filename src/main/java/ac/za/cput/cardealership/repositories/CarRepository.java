package ac.za.cput.cardealership.repositories;

import ac.za.cput.cardealership.domain.Car;
import ac.za.cput.cardealership.domain.CarModel;

import java.util.Set;

public interface CarRepository{
    Car create(Car car);

    Car read(String carID);

    Car update(Car car);

    void delete(String carID);
}
