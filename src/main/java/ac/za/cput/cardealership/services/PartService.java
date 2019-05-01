package ac.za.cput.cardealership.services;

import ac.za.cput.cardealership.domain.Part;

public interface PartService {

    Part create(Part part);

    Part read(String partID);

    Part update(Part part);

    void delete(String partID);
}
