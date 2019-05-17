package ac.za.cput.cardealership.repositories.vehicle;

import ac.za.cput.cardealership.domain.vehicle.CarModel;

public interface CarModelRepository{
    CarModel create(CarModel model);

    CarModel read(String name);

    CarModel update(CarModel model);

    void delete(String name);
}
