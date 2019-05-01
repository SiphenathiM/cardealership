package ac.za.cput.cardealership.services;

import ac.za.cput.cardealership.domain.City;

public interface CityService {

    City create(City city);

    City read(String cityZipCode);

    City update(City city);

    void delete(String cityZipCode);
}
