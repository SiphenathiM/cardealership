package ac.za.cput.cardealership.repositories;

import ac.za.cput.cardealership.domain.Customer;
import ac.za.cput.cardealership.domain.FinancingSale;

import java.util.Set;

public interface FinancingSaleRepository  {

    FinancingSale create(FinancingSale financingSale);

    FinancingSale read(String totalPeriod);

    FinancingSale update(FinancingSale financingSale);

    void delete(String totalPeriod);
}
