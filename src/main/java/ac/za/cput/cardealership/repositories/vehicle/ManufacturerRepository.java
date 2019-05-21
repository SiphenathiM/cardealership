package ac.za.cput.cardealership.repositories.vehicle;

import ac.za.cput.cardealership.domain.product.PartUsed;
import ac.za.cput.cardealership.domain.vehicle.Manufacturer;
import ac.za.cput.cardealership.repositories.IRepository.IRepository;

import java.util.Set;

public interface ManufacturerRepository extends IRepository<Manufacturer,String> {

    Set<Manufacturer> getAll();
}
