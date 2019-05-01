package ac.za.cput.cardealership.services;

import ac.za.cput.cardealership.domain.Car;

public interface CarService {

    Car create(Car car);

    Car read(String carID);

    Car update(Car car);

    void delete(String carID);
}
