package ac.za.cput.cardealership.services;

import ac.za.cput.cardealership.domain.Mechanic;

public interface MechanicService {

    Mechanic create(Mechanic mechanic);

    Mechanic read(String mechanicID);

    Mechanic update(Mechanic mechanic);

    void delete(String mechanicID);


}
