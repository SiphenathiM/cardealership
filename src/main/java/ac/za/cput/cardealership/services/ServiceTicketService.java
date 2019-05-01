package ac.za.cput.cardealership.services;

import ac.za.cput.cardealership.domain.ServiceTicket;

public interface ServiceTicketService {


    ServiceTicket create(ServiceTicket service);

    ServiceTicket read(String serviceTicketID);

    ServiceTicket update(ServiceTicket service);

    void delete(String serviceTicketID);
}
