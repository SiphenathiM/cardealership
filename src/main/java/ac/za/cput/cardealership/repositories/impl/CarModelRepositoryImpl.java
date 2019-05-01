package ac.za.cput.cardealership.repositories.impl;

import ac.za.cput.cardealership.domain.Address;
import ac.za.cput.cardealership.domain.CarModel;
import ac.za.cput.cardealership.repositories.CarModelRepository;

import java.util.HashMap;
import java.util.Map;

public class CarModelRepositoryImpl implements CarModelRepository {

    private static CarModelRepositoryImpl respository = null;

    private Map<String,CarModel> carModelTable;

    private CarModelRepositoryImpl() {
        carModelTable = new HashMap<String, CarModel>();
    }

    public static CarModelRepositoryImpl getInstance(){
        if(respository==null)
            respository = new CarModelRepositoryImpl();
        return respository;
    }



    @Override
    public CarModel create(CarModel model) {
        carModelTable.put(model.getName(),model);
        CarModel savedModels = carModelTable.get(model.getName());
        return savedModels;
    }

    @Override
    public CarModel read(String name) {
        CarModel model  = carModelTable.get(name);
        return model;
    }

    @Override
    public CarModel update(CarModel model) {
        carModelTable.put(model.getName(),model);
        CarModel savedModels= carModelTable.get(model.getName());
        return savedModels;
    }

    @Override
    public void delete(String model) {
        carModelTable.remove(model);
    }

}
