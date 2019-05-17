package ac.za.cput.cardealership.factory.people;

import ac.za.cput.cardealership.domain.people.Person;
import ac.za.cput.cardealership.util.Misc;

import java.util.Map;

public class PersonFactory {

    public static Person getPerson( Map<String, String> values,String phoneNumber){
        return new Person.Builder().id(Misc.generatedId())
                .firstname(values.get("firstname"))
                .lastname(values.get("lastname"))
                .phoneNumber(phoneNumber)
                .build();
    }
}

