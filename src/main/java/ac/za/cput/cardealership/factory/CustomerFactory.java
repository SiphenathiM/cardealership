package ac.za.cput.cardealership.factory;

import ac.za.cput.cardealership.domain.Customer;
import ac.za.cput.cardealership.util.CustId;

public class CustomerFactory {

    public static Customer getCustomer(String firstname){
        return new Customer.Builder().id(CustId.generatedId())
                .firstname(firstname)
                .build();
    }
}
