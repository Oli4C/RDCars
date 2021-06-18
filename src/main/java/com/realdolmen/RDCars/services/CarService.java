package com.realdolmen.RDCars.services;


import com.realdolmen.RDCars.models.Car;
import com.realdolmen.RDCars.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    //Get All Vehicles
    public List<Car> findAll(){
        return carRepository.findAll();
    }

    //Get Vehicle By Id
    public Car findById(int id) {
        return carRepository.findById(id);
    }
    //Optional<NewCar>
    //Delete Vehicle
    public void delete(int id) {
        carRepository.deleteById(id);
    }

    //Update Vehicle
    public void save(Car car) {
        carRepository.save(car);
    }

    public void update(Car car) {
        carRepository.save(car);
    }
}
