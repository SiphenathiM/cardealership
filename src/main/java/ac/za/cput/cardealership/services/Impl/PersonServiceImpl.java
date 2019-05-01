package ac.za.cput.cardealership.services.Impl;

import ac.za.cput.cardealership.domain.Person;
import ac.za.cput.cardealership.repositories.PersonRepository;
import ac.za.cput.cardealership.repositories.impl.PersonRepositoryImpl;
import ac.za.cput.cardealership.services.PersonService;

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
