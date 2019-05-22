package ac.za.cput.cardealership.repositories.people.impl;

import ac.za.cput.cardealership.domain.people.City;
import ac.za.cput.cardealership.repositories.people.CityRepository;

import java.util.HashSet;
import java.util.Set;

public class CityRepositoryImpl implements CityRepository {


    private static CityRepositoryImpl repository = null;
    private Set<City> city;

    private CityRepositoryImpl(){
        this.city = new HashSet<>();
    }

    public static CityRepositoryImpl getRepository(){
        if (repository == null) repository = new CityRepositoryImpl();
        return repository;
    }

    private City search(String CityZipCode){
        return this.city.stream()
                .filter(city -> city.getCityZipCode().trim().equals( CityZipCode ) )
                .findAny()
                .orElse( null );
    }


    @Override
    public Set<City> getAll() {
        return null;

    }

    @Override
    public City create(City city) {
        this.city.add(city);
        return city;
    }

    @Override
    public City update(City city) {
        City toUpdate = search(city.getCityZipCode() );
        if(toUpdate != null){
            this.city.remove( toUpdate );
            return create(city);
        }
        return null;
    }

    @Override
    public void delete(String s) {
        City city = search( s);
        if(city != null) this.city.remove( city );
    }

    @Override
    public City read(String s) {
        City  city = search( s );
        return city;
    }
}
