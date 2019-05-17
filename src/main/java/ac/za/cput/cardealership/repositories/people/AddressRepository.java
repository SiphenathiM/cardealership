package ac.za.cput.cardealership.repositories.people;

import ac.za.cput.cardealership.domain.people.Address;

public  interface AddressRepository {
    Address create(Address address);

    Address read(String number);

    Address update(Address address);

    void delete(String number);

}
