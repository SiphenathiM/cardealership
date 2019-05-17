package ac.za.cput.cardealership.repositories.people;

import ac.za.cput.cardealership.domain.people.Mechanic;

public interface MechanicRepository {

    Mechanic create(Mechanic mechanic);

    Mechanic read(String mechanicID);

    Mechanic update(Mechanic mechanic);

    void delete(String mechanicID);
}
