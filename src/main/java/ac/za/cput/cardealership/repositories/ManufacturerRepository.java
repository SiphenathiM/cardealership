package ac.za.cput.cardealership.repositories;

import ac.za.cput.cardealership.domain.FinancingSale;
import ac.za.cput.cardealership.domain.Manufacturer;

import java.util.Set;

public interface ManufacturerRepository{

    Manufacturer create(Manufacturer manufacturer);

    Manufacturer read(String name);

    Manufacturer update(Manufacturer manufacturer);

    void delete(String name);
}
