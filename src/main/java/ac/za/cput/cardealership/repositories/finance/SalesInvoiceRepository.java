package ac.za.cput.cardealership.repositories.finance;

import ac.za.cput.cardealership.domain.finance.SalesInvoice;
import ac.za.cput.cardealership.domain.people.Salesperson;
import ac.za.cput.cardealership.repositories.IRepository.IRepository;

import java.util.Set;

public interface SalesInvoiceRepository extends IRepository<SalesInvoice,String> {

    Set<SalesInvoice> getAll();

    Salesperson update(Salesperson salesperson);
}
