package ac.za.cput.cardealership.repositories;

import ac.za.cput.cardealership.domain.City;
import ac.za.cput.cardealership.domain.Customer;

import java.util.Set;

public interface CustomerRepository {

    Customer create(Customer customer);

    Customer read(String type);

    Customer update(Customer customer);

    void delete(String type);
}
