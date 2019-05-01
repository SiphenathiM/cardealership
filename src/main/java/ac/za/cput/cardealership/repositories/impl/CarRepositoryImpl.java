package ac.za.cput.cardealership.repositories.impl;

import ac.za.cput.cardealership.domain.Car;
import ac.za.cput.cardealership.repositories.CarRepository;

import java.util.HashMap;
import java.util.Map;

public class CarRepositoryImpl implements CarRepository {


    private static CarRepositoryImpl respository = null;

    private Map<String, Car> carTable;

    private CarRepositoryImpl() {
        carTable = new HashMap<String, Car>();
    }

    public static CarRepositoryImpl getInstance(){
        if(respository==null)
            respository = new CarRepositoryImpl();
        return respository;
    }


    @Override
    public Car create(Car car) {
        carTable.put(car.getCarID(),car);
        Car savedCar = carTable.get(car.getCarID());
        return savedCar;
    }


    @Override
    public Car read(String carID) {
        Car car  = carTable.get(carID);
        return car ;
    }


    @Override
    public Car update(Car car) {
        carTable.put(car.getCarID(),car);
        Car savedCar= carTable.get(car.getCarID());
        return savedCar;
    }

    @Override
    public void delete(String carID) {
        carTable.remove(carID);
    }
}
