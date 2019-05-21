package ac.za.cput.cardealership.repositories.product;

import ac.za.cput.cardealership.domain.finance.SalesInvoice;
import ac.za.cput.cardealership.domain.product.Part;
import ac.za.cput.cardealership.repositories.IRepository.IRepository;

import javax.imageio.event.IIOReadProgressListener;
import java.util.Set;

public interface PartRepository extends IRepository<Part,String> {

    Set<Part> getAll();
}
