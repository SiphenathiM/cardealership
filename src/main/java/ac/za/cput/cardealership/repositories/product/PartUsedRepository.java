package ac.za.cput.cardealership.repositories.product;

import ac.za.cput.cardealership.domain.product.PartUsed;

public interface PartUsedRepository{

    PartUsed create(PartUsed partUsed);

    PartUsed read(String partsUsedID);

    PartUsed update(PartUsed partUsed);

    void delete(String partsUsedID);
}
