package ac.za.cput.cardealership.factory;


import ac.za.cput.cardealership.domain.Car;
import ac.za.cput.cardealership.domain.CarModel;
import ac.za.cput.cardealership.util.Misc;

public class CarModelFactory {

    public static CarModel getCarModel(String name,double price){
        return new CarModel.Builder().name(name)
                .price(price)
                .build();
    }

}
