package ac.za.cput.cardealership.repositories;

import ac.za.cput.cardealership.domain.ServiceTicket;
import ac.za.cput.cardealership.domain.ServiceType;

import java.util.Set;

public interface ServiceTypeRepository{


    ServiceType create(ServiceType service);

    ServiceType read(String typeID);

    ServiceType update(ServiceType service);

    void delete(String typeID);
}
