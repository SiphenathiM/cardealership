package ac.za.cput.cardealership.repositories.people;

import ac.za.cput.cardealership.domain.people.Customer;

public interface CustomerRepository {

    Customer create(Customer customer);

    Customer read(String type);

    Customer update(Customer customer);

    void delete(String type);
}
