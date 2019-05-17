package ac.za.cput.cardealership.repositories.finance;

import ac.za.cput.cardealership.domain.finance.FinancingSale;

public interface FinancingSaleRepository  {

    FinancingSale create(FinancingSale financingSale);

    FinancingSale read(String totalPeriod);

    FinancingSale update(FinancingSale financingSale);

    void delete(String totalPeriod);
}
