package ac.za.cput.cardealership.repositories.people;

import ac.za.cput.cardealership.domain.people.Mechanic;
import ac.za.cput.cardealership.domain.people.Person;
import ac.za.cput.cardealership.repositories.IRepository.IRepository;

import java.util.Set;

public interface MechanicRepository extends IRepository<Mechanic,String> {

    Set<Mechanic> getAll();
}
