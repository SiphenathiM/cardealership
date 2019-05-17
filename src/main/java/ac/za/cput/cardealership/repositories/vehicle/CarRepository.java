package ac.za.cput.cardealership.repositories.vehicle;

import ac.za.cput.cardealership.domain.vehicle.Car;

public interface CarRepository{
    Car create(Car car);

    Car read(String carID);

    Car update(Car car);

    void delete(String carID);
}
