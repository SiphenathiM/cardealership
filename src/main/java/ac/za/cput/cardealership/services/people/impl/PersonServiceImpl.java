package ac.za.cput.cardealership.services.people.impl;

import ac.za.cput.cardealership.domain.people.Person;
import ac.za.cput.cardealership.repositories.people.PersonRepository;
import ac.za.cput.cardealership.repositories.people.impl.PersonRepositoryImpl;
import ac.za.cput.cardealership.services.people.PersonService;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    private static PersonServiceImpl service = null;

    PersonRepository repository = PersonRepositoryImpl.getInstance();

    public static PersonServiceImpl getInstance(){
        if(service == null)
            service = new PersonServiceImpl();
        return service;
    }


    @Override
    public Person create(Person person) {
       return repository.create(person);
    }

    @Override
    public Person read(String id) {
        return repository.read(id);
    }

    @Override
    public Person update(Person person) {
        return repository.update(person);
    }

    @Override
    public void delete(String id) {
        repository.delete(id);
    }
}
