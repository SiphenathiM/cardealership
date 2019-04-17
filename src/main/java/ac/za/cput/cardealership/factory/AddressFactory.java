package ac.za.cput.cardealership.factory;

import ac.za.cput.cardealership.domain.Address;

import ac.za.cput.cardealership.util.AdressNo;
import ac.za.cput.cardealership.util.CustId;

public class AddressFactory {

    public static Address getAddress(String street){
        return new Address.Builder().number(AdressNo.generatedNumber())
                .street(street)
                .build();
    }
}
