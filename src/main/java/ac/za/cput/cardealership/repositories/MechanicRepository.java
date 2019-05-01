package ac.za.cput.cardealership.repositories;

import ac.za.cput.cardealership.domain.Manufacturer;
import ac.za.cput.cardealership.domain.Mechanic;

import java.util.Set;

public interface MechanicRepository {

    Mechanic create(Mechanic mechanic);

    Mechanic read(String mechanicID);

    Mechanic update(Mechanic mechanic);

    void delete(String mechanicID);
}
