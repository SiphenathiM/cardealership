package ac.za.cput.cardealership.repositories.people.impl;

import ac.za.cput.cardealership.domain.people.Person;
import ac.za.cput.cardealership.repositories.people.PersonRepository;

import java.util.HashSet;
import java.util.Set;

public class PersonRepositoryImpl implements PersonRepository {

    private static PersonRepositoryImpl  repository = null;
    private Set<Person> person;

    private PersonRepositoryImpl(){
        this.person = new HashSet<>();
    }

    public static PersonRepositoryImpl  getRepository(){
        if (repository == null) repository = new PersonRepositoryImpl ();
        return repository;
    }

    private Person search(String Id){
        return this.person.stream()
                .filter( person -> person.getId().trim().equals( Id ) )
                .findAny()
                .orElse( null );
    }

    @Override
    public Set<Person> getAll() {
        return this.person;
    }

    @Override
    public Person create(Person person) {
        this.person.add(person);
        return person;
    }

    @Override
    public Person update(Person person) {
        Person toUpdate = search( person.getId() );
        if(toUpdate != null){
            this.person.remove( toUpdate );
            return create( person );
        }
        return null;
    }

    @Override
    public void delete(String id) {
        Person person = search( id );
        if(person != null) this.person.remove( person );
    }

    @Override
    public Person read(String id) {
        Person person = search( id );
        return person;
    }
}
