package ac.za.cput.cardealership.factory;

import ac.za.cput.cardealership.domain.City;

public class CityFactory {

    public static City getCity(String cityZipCode,String cityName){
        return new City.Builder().cityZipCode(cityZipCode)
                .cityName(cityName)
                .build();
    }
}
