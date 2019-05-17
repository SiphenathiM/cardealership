package ac.za.cput.cardealership.repositories.people;

import ac.za.cput.cardealership.domain.people.Person;

public interface PersonRepository {

    Person create(Person person);

    Person read(String id);

    Person update(Person person);

    void delete(String id);

}
