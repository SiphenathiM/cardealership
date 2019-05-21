package ac.za.cput.cardealership.repositories.people;

import ac.za.cput.cardealership.domain.people.Customer;
import ac.za.cput.cardealership.domain.people.Person;
import ac.za.cput.cardealership.repositories.IRepository.IRepository;

import java.util.Set;

public interface CustomerRepository extends IRepository<Customer,String> {

    Set<Customer> getAll();
}
