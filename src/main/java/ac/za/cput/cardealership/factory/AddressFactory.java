package ac.za.cput.cardealership.factory;

import ac.za.cput.cardealership.domain.Address;

import ac.za.cput.cardealership.util.Misc;

public class AddressFactory {

    public static Address getAddress(String street){
        return new Address.Builder().number(Misc.generatedId())
                .street(street)
                .build();
    }
}
