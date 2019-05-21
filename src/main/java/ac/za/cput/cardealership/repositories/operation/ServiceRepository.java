package ac.za.cput.cardealership.repositories.operation;

import ac.za.cput.cardealership.domain.finance.FinancingSale;
import ac.za.cput.cardealership.domain.operation.Service;
import ac.za.cput.cardealership.repositories.IRepository.IRepository;

import java.util.Set;

public interface ServiceRepository extends IRepository<Service,String>{

    Set<Service> getAll();
}
