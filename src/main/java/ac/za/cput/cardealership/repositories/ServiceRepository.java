package ac.za.cput.cardealership.repositories;

import ac.za.cput.cardealership.domain.Service;
import ac.za.cput.cardealership.domain.ServiceRecord;

import java.util.Set;

public interface ServiceRepository{

    Service create(Service service);

    Service read(String serviceID);

    Service update(Service service);

    void delete(String serviceID);
}
