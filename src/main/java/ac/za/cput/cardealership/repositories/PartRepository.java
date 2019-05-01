package ac.za.cput.cardealership.repositories;

import ac.za.cput.cardealership.domain.Mechanic;
import ac.za.cput.cardealership.domain.Part;

import java.util.Set;

public interface PartRepository {

    Part create(Part part);

    Part read(String partID);

    Part update(Part part);

    void delete(String partID);
}
