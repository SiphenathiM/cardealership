package ac.za.cput.cardealership.repositories;

import ac.za.cput.cardealership.domain.CashSale;
import ac.za.cput.cardealership.domain.City;

import java.util.Set;

public interface CityRepository{
    City create(City city);

    City read(String cityZipCode);

    City update(City city);

    void delete(String cityZipCode);
}
