package ac.za.cput.cardealership.repositories.finance;

import ac.za.cput.cardealership.domain.finance.Sale;
import ac.za.cput.cardealership.domain.finance.SalesInvoice;
import ac.za.cput.cardealership.repositories.IRepository.IRepository;

import java.util.Set;

public interface SaleRepository extends IRepository<Sale,String> {

    Set<Sale> getAll();


}
