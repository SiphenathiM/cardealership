package ac.za.cput.cardealership.services;

import ac.za.cput.cardealership.domain.PartUsed;

public interface PartUsedService {

    PartUsed create(PartUsed partUsed);

    PartUsed read(String partsUsedID);

    PartUsed update(PartUsed partUsed);

    void delete(String partsUsedID);
}
