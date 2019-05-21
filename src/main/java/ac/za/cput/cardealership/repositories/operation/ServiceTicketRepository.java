package ac.za.cput.cardealership.repositories.operation;

import ac.za.cput.cardealership.domain.finance.FinancingSale;
import ac.za.cput.cardealership.domain.operation.ServiceTicket;
import ac.za.cput.cardealership.repositories.IRepository.IRepository;

import java.util.Set;

public interface ServiceTicketRepository extends IRepository<ServiceTicket,String> {


    Set<ServiceTicket> getAll();
}
