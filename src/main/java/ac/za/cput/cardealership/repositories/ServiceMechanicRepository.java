package ac.za.cput.cardealership.repositories;

import ac.za.cput.cardealership.domain.ServiceMechanic;

import java.util.Set;

public interface ServiceMechanicRepository {

    ServiceMechanic create(ServiceMechanic serviceMechanic);

    ServiceMechanic read(String serviceMachenicID);

    ServiceMechanic update(ServiceMechanic serviceMechanic);

    void delete(String serviceMachenicID);
}
