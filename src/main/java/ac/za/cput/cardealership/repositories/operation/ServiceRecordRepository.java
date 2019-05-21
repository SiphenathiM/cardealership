package ac.za.cput.cardealership.repositories.operation;

import ac.za.cput.cardealership.domain.finance.FinancingSale;
import ac.za.cput.cardealership.domain.operation.ServiceRecord;
import ac.za.cput.cardealership.repositories.IRepository.IRepository;

import java.util.Set;

public interface ServiceRecordRepository extends IRepository<ServiceRecord,String> {

    Set<ServiceRecord> getAll();
}
