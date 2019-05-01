package ac.za.cput.cardealership.repositories;

import ac.za.cput.cardealership.domain.Address;
import ac.za.cput.cardealership.domain.CarModel;

import java.util.Set;

public interface CarModelRepository{
    CarModel create(CarModel model);

    CarModel read(String name);

    CarModel update(CarModel model);

    void delete(String name);
}
