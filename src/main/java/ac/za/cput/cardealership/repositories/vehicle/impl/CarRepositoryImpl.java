package ac.za.cput.cardealership.repositories.vehicle.impl;

import ac.za.cput.cardealership.domain.vehicle.Car;
import ac.za.cput.cardealership.repositories.vehicle.CarRepository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CarRepositoryImpl implements CarRepository {


    private static CarRepository carRepository = null;
    private Set<Car> carDB;

    private CarRepositoryImpl() {
        this.carDB = new HashSet<>();
    }

    public static CarRepository getCarRepository(){
        if(carRepository==null) carRepository = new CarRepositoryImpl();
        return carRepository;
    }


    @Override
    public Car create(Car car) {
        this.carDB.add(car);
        return car;
    }


    @Override
    public Car read(String s) {
        Car c = this.carDB.stream().filter(car -> car.getSerialNumber().equalsIgnoreCase(s)).findAny().orElse(null);
        return  c;
    }


    @Override
    public Car update(Car car) {
        Car p = read(car.getSerialNumber());
        if(p != null){
            this.carDB.remove(p);
            return create(car);
        }
        return null;
    }

    @Override
    public void delete(String s) {
        Car c = read(s);
        this.carDB.remove(c);
    }

    @Override
    public Set<Car> getAll() {

        return this.carDB;
    }
}
