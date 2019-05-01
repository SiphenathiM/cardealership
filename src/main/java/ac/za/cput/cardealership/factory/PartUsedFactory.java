package ac.za.cput.cardealership.factory;

import ac.za.cput.cardealership.domain.Car;
import ac.za.cput.cardealership.domain.PartUsed;
import ac.za.cput.cardealership.util.Misc;

public class PartUsedFactory {

    public static PartUsed getPartUsed(int numberUsed,double price){
        return new PartUsed.Builder().partsUsedID(Misc.generatedId())
                .numberUsed(numberUsed)
                .build();
    }
}
