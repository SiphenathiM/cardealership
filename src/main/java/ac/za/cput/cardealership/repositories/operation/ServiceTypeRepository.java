package ac.za.cput.cardealership.repositories.operation;

import ac.za.cput.cardealership.domain.finance.FinancingSale;
import ac.za.cput.cardealership.domain.operation.ServiceType;
import ac.za.cput.cardealership.repositories.IRepository.IRepository;

import java.util.Set;

public interface ServiceTypeRepository extends IRepository<ServiceType,String> {


    Set<ServiceType> getAll();
}
