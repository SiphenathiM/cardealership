package ac.za.cput.cardealership.repositories.people.impl;

import ac.za.cput.cardealership.domain.people.Address;
import ac.za.cput.cardealership.repositories.people.AddressRepository;

import java.util.HashSet;
import java.util.Set;


public class AddressRepositoryImpl implements AddressRepository {

    private static AddressRepositoryImpl repository = null;
    private Set<Address> addresses;

    private AddressRepositoryImpl(){
        this.addresses = new HashSet<>();
    }

    public static AddressRepositoryImpl getRepository(){
        if (repository == null) repository = new AddressRepositoryImpl();
        return repository;
    }

    private Address search(String number){
        return this.addresses.stream()
                .filter(addresses -> addresses.getNumber().trim().equals(number ) )
                .findAny()
                .orElse( null );
    }


    @Override
    public Set<Address> getAll() {
        return null;
    }

    @Override
    public Address create(Address address) {
        this.addresses.add(address);
        return address;
    }

    @Override
    public Address update(Address address) {
        Address toUpdate = search(address.getNumber() );
        if(toUpdate != null){
            this.addresses.remove( toUpdate );
            return create(address );
        }
        return null;
    }

    @Override
    public void delete(String number) {
        Address address = search( number);
        if(address != null) this.addresses.remove( address );
    }

    @Override
    public Address read(String number) {
        Address  address = search( number );
        return address;
    }
}
