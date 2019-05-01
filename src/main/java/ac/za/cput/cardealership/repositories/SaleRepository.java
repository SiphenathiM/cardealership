package ac.za.cput.cardealership.repositories;

import ac.za.cput.cardealership.domain.Person;
import ac.za.cput.cardealership.domain.Sale;

import java.util.Set;

public interface SaleRepository {

    Sale create(Sale sale);

    Sale read(String date);

    Sale update(Sale sale);

    void delete(String date);
}
