package ac.za.cput.cardealership.repositories;

import ac.za.cput.cardealership.domain.Address;

import java.util.Set;

public  interface AddressRepository {
    Address create(Address address);

    Address read(String number);

    Address update(Address address);

    void delete(String number);

}
