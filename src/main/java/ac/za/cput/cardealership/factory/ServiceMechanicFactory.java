package ac.za.cput.cardealership.factory;

import ac.za.cput.cardealership.domain.Service;
import ac.za.cput.cardealership.domain.ServiceMechanic;
import ac.za.cput.cardealership.util.Misc;

public class ServiceMechanicFactory {


    public static ServiceMechanic getServiceMechanic(String name){
        return new ServiceMechanic.Builder().serviceMachenicID(Misc.generatedId())
                .name(name)
                .build();
    }
}
