package ac.za.cput.cardealership.util;

import java.util.UUID;

public class AdressNo {

    public  static  String generatedNumber(){
        return UUID.randomUUID().toString();
    }
}
