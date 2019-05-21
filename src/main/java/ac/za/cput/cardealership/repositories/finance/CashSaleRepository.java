package ac.za.cput.cardealership.repositories.finance;


import ac.za.cput.cardealership.domain.finance.CashSale;
import ac.za.cput.cardealership.domain.finance.Sale;
import ac.za.cput.cardealership.repositories.IRepository.IRepository;

import java.util.Set;


public interface CashSaleRepository extends IRepository<CashSale,String> {

    Set<CashSale> getAll();
}
