package ac.za.cput.cardealership.repositories.vehicle;

import ac.za.cput.cardealership.domain.product.PartUsed;
import ac.za.cput.cardealership.domain.vehicle.Car;
import ac.za.cput.cardealership.repositories.IRepository.IRepository;

import java.util.Set;

public interface CarRepository extends IRepository<Car,String> {
    Set<Car> getAll();
}
