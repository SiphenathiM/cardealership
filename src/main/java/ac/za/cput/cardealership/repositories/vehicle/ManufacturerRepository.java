package ac.za.cput.cardealership.repositories.vehicle;

import ac.za.cput.cardealership.domain.vehicle.Manufacturer;

public interface ManufacturerRepository{

    Manufacturer create(Manufacturer manufacturer);

    Manufacturer read(String name);

    Manufacturer update(Manufacturer manufacturer);

    void delete(String name);
}
