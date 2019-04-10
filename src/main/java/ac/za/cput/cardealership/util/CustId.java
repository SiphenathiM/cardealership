package ac.za.cput.cardealership.util;

import java.util.UUID;

public class CustId {

    public  static  String generatedId(){
        return UUID.randomUUID().toString();
    }
}
