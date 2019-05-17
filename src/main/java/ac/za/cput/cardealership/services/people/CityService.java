package ac.za.cput.cardealership.services.people;

import ac.za.cput.cardealership.domain.people.City;

public interface CityService {

    City create(City city);

    City read(String cityZipCode);

    City update(City city);

    void delete(String cityZipCode);
}
