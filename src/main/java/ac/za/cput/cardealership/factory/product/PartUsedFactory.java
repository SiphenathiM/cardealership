package ac.za.cput.cardealership.factory.product;

import ac.za.cput.cardealership.domain.product.PartUsed;
import ac.za.cput.cardealership.util.Misc;

public class PartUsedFactory {

    public static PartUsed getPartUsed(int numberUsed,double price){
        return new PartUsed.Builder().partsUsedID(Misc.generatedId())
                .numberUsed(numberUsed)
                .build();
    }
}
