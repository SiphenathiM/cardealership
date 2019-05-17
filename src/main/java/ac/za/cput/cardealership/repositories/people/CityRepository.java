package ac.za.cput.cardealership.repositories.people;

import ac.za.cput.cardealership.domain.people.City;

public interface CityRepository{
    City create(City city);

    City read(String cityZipCode);

    City update(City city);

    void delete(String cityZipCode);
}
