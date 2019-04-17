package ac.za.cput.cardealership.util;

import java.util.UUID;

public class CarGen {

    public  static  String generatedId(){
        return UUID.randomUUID().toString();
    }
}
