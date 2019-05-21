package ac.za.cput.cardealership.repositories.finance;

import ac.za.cput.cardealership.domain.finance.FinancingSale;
import ac.za.cput.cardealership.domain.finance.Sale;
import ac.za.cput.cardealership.repositories.IRepository.IRepository;

import java.util.Set;

public interface FinancingSaleRepository extends IRepository<FinancingSale,String> {

    Set<FinancingSale> getAll();
}
