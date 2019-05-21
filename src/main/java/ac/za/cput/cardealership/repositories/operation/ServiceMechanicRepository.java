package ac.za.cput.cardealership.repositories.operation;

import ac.za.cput.cardealership.domain.finance.FinancingSale;
import ac.za.cput.cardealership.domain.operation.ServiceMechanic;
import ac.za.cput.cardealership.repositories.IRepository.IRepository;

import java.util.Set;

public interface ServiceMechanicRepository extends IRepository<ServiceMechanic,String> {

    Set<ServiceMechanic> getAll();
}
