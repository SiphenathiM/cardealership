package ac.za.cput.cardealership.repositories.vehicle;

import ac.za.cput.cardealership.domain.product.PartUsed;
import ac.za.cput.cardealership.domain.vehicle.CarModel;
import ac.za.cput.cardealership.repositories.IRepository.IRepository;

import java.util.Set;

public interface CarModelRepository extends IRepository<CarModel,String> {
    Set<CarModel> getAll();
}
