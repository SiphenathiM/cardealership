package ac.za.cput.cardealership.repositories.operation;

import ac.za.cput.cardealership.domain.operation.Service;

public interface ServiceRepository{

    Service create(Service service);

    Service read(String serviceID);

    Service update(Service service);

    void delete(String serviceID);
}
