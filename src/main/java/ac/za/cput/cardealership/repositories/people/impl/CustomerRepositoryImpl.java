package ac.za.cput.cardealership.repositories.people.impl;

import ac.za.cput.cardealership.domain.people.Customer;
import ac.za.cput.cardealership.repositories.people.CustomerRepository;

import java.util.HashSet;
import java.util.Set;

public class CustomerRepositoryImpl implements CustomerRepository {

    private static CustomerRepositoryImpl repository = null;
    private Set<Customer> customer;

    private CustomerRepositoryImpl(){
        this.customer = new HashSet<>();
    }

    public static CustomerRepositoryImpl getRepository(){
        if (repository == null) repository = new CustomerRepositoryImpl();
        return repository;
    }

    private Customer search(String type){
        return this.customer.stream()
                .filter(customer -> customer.getType().trim().equals( type ) )
                .findAny()
                .orElse( null );
    }


    @Override
    public Set<Customer> getAll() {
        return null;
    }

    @Override
    public Customer create(Customer customer) {
        this.customer.add(customer);
        return customer;
    }

    @Override
    public Customer update(Customer customer) {
        Customer toUpdate = search(customer.getType() );
        if(toUpdate != null){
            this.customer.remove( toUpdate );
            return create(customer );
        }
        return null;
    }

    @Override
    public void delete(String type) {
        Customer customer = search( type);
        if(customer != null) this.customer.remove( customer );
    }

    @Override
    public Customer read(String type) {
        Customer customer = search( type );
        return customer;
    }
}
