package ac.za.cput.cardealership.services.people;

import ac.za.cput.cardealership.domain.people.Mechanic;

public interface MechanicService {

    Mechanic create(Mechanic mechanic);

    Mechanic read(String mechanicID);

    Mechanic update(Mechanic mechanic);

    void delete(String mechanicID);


}
