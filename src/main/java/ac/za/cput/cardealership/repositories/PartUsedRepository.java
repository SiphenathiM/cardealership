package ac.za.cput.cardealership.repositories;

import ac.za.cput.cardealership.domain.Part;
import ac.za.cput.cardealership.domain.PartUsed;

import java.util.Set;

public interface PartUsedRepository{

    PartUsed create(PartUsed partUsed);

    PartUsed read(String partsUsedID);

    PartUsed update(PartUsed partUsed);

    void delete(String partsUsedID);
}
