package ac.za.cput.cardealership.services.people;

import ac.za.cput.cardealership.domain.people.Customer;

public interface CustomerService {

    Customer create(Customer customer);

    Customer read(String type);

    Customer update(Customer customer);

    void delete(String type);
}
