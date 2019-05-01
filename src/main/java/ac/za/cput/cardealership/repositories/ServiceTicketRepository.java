package ac.za.cput.cardealership.repositories;

import ac.za.cput.cardealership.domain.Service;
import ac.za.cput.cardealership.domain.ServiceTicket;

import java.util.Set;

public interface ServiceTicketRepository {


    ServiceTicket create(ServiceTicket service);

    ServiceTicket read(String serviceTicketID);

    ServiceTicket update(ServiceTicket service);

    void delete(String serviceTicketID);
}
