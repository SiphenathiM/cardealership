package ac.za.cput.cardealership.repositories.operation;

import ac.za.cput.cardealership.domain.operation.ServiceMechanic;

public interface ServiceMechanicRepository {

    ServiceMechanic create(ServiceMechanic serviceMechanic);

    ServiceMechanic read(String serviceMachenicID);

    ServiceMechanic update(ServiceMechanic serviceMechanic);

    void delete(String serviceMachenicID);
}
