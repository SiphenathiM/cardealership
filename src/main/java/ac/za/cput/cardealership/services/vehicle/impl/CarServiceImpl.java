package ac.za.cput.cardealership.services.vehicle.impl;

import ac.za.cput.cardealership.domain.vehicle.Car;
import ac.za.cput.cardealership.repositories.vehicle.CarRepository;
import ac.za.cput.cardealership.repositories.vehicle.impl.CarRepositoryImpl;
import ac.za.cput.cardealership.services.vehicle.CarService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class CarServiceImpl implements CarService {

    private static  CarService carService = null;
    private CarRepository carRepository;

    private CarServiceImpl(){
        this.carRepository = CarRepositoryImpl.getCarRepository();
    }

    @Override
    public Set<Car> getAll() {
        return this.carRepository.getAll();

    }
    @Override
    public Car create(Car car) {
        return this.carRepository.create(car);
    }

    @Override
    public Car update(Car car) {
        return this.carRepository.update(car);
    }

    @Override
    public void delete(String s) {
        this.carRepository.delete(s);

    }

    @Override
    public Car read(String s) {
        return this.carRepository.read(s);
    }
}
