package ac.za.cput.cardealership.repositories.operation;

import ac.za.cput.cardealership.domain.operation.ServiceRecord;

public interface ServiceRecordRepository {

    ServiceRecord create(ServiceRecord serviceMechanic);

    ServiceRecord read(String date);

    ServiceRecord update(ServiceRecord serviceMechanic);

    void delete(String date);
}
