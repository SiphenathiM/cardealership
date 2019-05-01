package ac.za.cput.cardealership.factory;

import ac.za.cput.cardealership.domain.Address;
import ac.za.cput.cardealership.domain.Part;
import ac.za.cput.cardealership.util.Misc;

public class PartFactory {


    public static Part getPart(int partNumber,String description,double price){
        return new Part.Builder().partID(Misc.generatedId())
                .partNumber(partNumber)
                .description(description)
                .price(price)
                .build();
    }

}
