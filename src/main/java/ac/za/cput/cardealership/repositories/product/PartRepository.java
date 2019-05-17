package ac.za.cput.cardealership.repositories.product;

import ac.za.cput.cardealership.domain.product.Part;

public interface PartRepository {

    Part create(Part part);

    Part read(String partID);

    Part update(Part part);

    void delete(String partID);
}
