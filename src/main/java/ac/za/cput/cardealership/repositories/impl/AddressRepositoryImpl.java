package ac.za.cput.cardealership.repositories.impl;

import ac.za.cput.cardealership.domain.Address;
import ac.za.cput.cardealership.repositories.AddressRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AddressRepositoryImpl implements AddressRepository {

    private static AddressRepositoryImpl respository = null;

    private Map<String,Address> addressTable;

    private AddressRepositoryImpl() {
        addressTable = new HashMap<String, Address>();
    }

    public static AddressRepositoryImpl getInstance(){
        if(respository==null)
            respository = new AddressRepositoryImpl();
        return respository;
    }



    @Override
    public Address create(Address address) {
        addressTable.put(address.getNumber(),address);
        Address savedAddress = addressTable.get(address.getNumber());
        return savedAddress;
    }

    @Override
    public Address read(String number) {
        Address address = addressTable.get(number);
        return address;
    }

    @Override
    public Address update(Address address) {
        addressTable.put(address.getNumber(),address);
        Address savedAddress = addressTable.get(address.getNumber());
        return savedAddress;
    }

    @Override
    public void delete(String number) {
        addressTable.remove(number);
    }


}
