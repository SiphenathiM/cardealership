package ac.za.cput.cardealership.repositories.operation;

import ac.za.cput.cardealership.domain.operation.ServiceType;

public interface ServiceTypeRepository{


    ServiceType create(ServiceType service);

    ServiceType read(String typeID);

    ServiceType update(ServiceType service);

    void delete(String typeID);
}
