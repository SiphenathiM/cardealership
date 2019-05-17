package ac.za.cput.cardealership.repositories.finance;

import ac.za.cput.cardealership.domain.finance.Sale;

public interface SaleRepository {

    Sale create(Sale sale);

    Sale read(String date);

    Sale update(Sale sale);

    void delete(String date);
}
