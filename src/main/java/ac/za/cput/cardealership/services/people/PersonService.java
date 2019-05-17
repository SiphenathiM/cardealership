package ac.za.cput.cardealership.services.people;

import ac.za.cput.cardealership.domain.people.Person;

public interface PersonService {

    Person create(Person person);
    Person read(String id);
    Person update(Person person);
    void delete (String id);

}
