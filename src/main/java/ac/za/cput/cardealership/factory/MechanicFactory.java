package ac.za.cput.cardealership.factory;

import ac.za.cput.cardealership.domain.Manufacturer;
import ac.za.cput.cardealership.domain.Mechanic;
import ac.za.cput.cardealership.util.Misc;

public class MechanicFactory {

    public static Mechanic getMechanic(String firstName, String lastName){
        return new Mechanic.Builder().mechanicID(Misc.generatedId())
                .firstName(firstName)
                .lastName(lastName)
                .build();
    }
}
