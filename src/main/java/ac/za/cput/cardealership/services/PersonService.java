package ac.za.cput.cardealership.services;

import ac.za.cput.cardealership.domain.Person;

public interface PersonService {

    Person create(Person person);
    Person read(String id);
    Person update(Person person);
    void delete (String id);

}
