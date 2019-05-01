package ac.za.cput.cardealership.repositories;

import ac.za.cput.cardealership.domain.ServiceMechanic;
import ac.za.cput.cardealership.domain.ServiceRecord;

import java.util.Set;

public interface ServiceRecordRepository {

    ServiceRecord create(ServiceRecord serviceMechanic);

    ServiceRecord read(String date);

    ServiceRecord update(ServiceRecord serviceMechanic);

    void delete(String date);
}
