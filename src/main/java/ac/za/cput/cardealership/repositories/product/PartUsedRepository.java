package ac.za.cput.cardealership.repositories.product;

import ac.za.cput.cardealership.domain.finance.SalesInvoice;
import ac.za.cput.cardealership.domain.product.PartUsed;
import ac.za.cput.cardealership.repositories.IRepository.IRepository;

import java.util.Set;

public interface PartUsedRepository extends IRepository<PartUsed,String> {

    Set<PartUsed> getAll();
}
