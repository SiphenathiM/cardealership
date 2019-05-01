package ac.za.cput.cardealership.repositories;

import ac.za.cput.cardealership.domain.PartUsed;
import ac.za.cput.cardealership.domain.Person;

import java.util.Set;

public interface PersonRepository {

    Person create(Person person);

    Person read(String id);

    Person update(Person person);

    void delete(String id);

}
