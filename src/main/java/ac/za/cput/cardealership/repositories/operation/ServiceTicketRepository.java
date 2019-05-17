package ac.za.cput.cardealership.repositories.operation;

import ac.za.cput.cardealership.domain.operation.ServiceTicket;

public interface ServiceTicketRepository {


    ServiceTicket create(ServiceTicket service);

    ServiceTicket read(String serviceTicketID);

    ServiceTicket update(ServiceTicket service);

    void delete(String serviceTicketID);
}
