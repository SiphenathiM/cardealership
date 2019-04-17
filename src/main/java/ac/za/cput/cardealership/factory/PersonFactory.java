package ac.za.cput.cardealership.factory;

import ac.za.cput.cardealership.domain.Person;
import ac.za.cput.cardealership.util.CustId;

public class PersonFactory {

    public static Person getCustomer(String firstname){
        return new Person.Builder().id(CustId.generatedId())
                .firstname(firstname)
                .build();
    }
}
