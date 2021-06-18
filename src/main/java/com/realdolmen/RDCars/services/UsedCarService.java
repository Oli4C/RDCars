package com.realdolmen.RDCars.services;

import com.realdolmen.RDCars.models.UsedCar;
import com.realdolmen.RDCars.repositories.UsedCarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsedCarService {

    @Autowired
    private UsedCarRepository usedCarRepository;

    //Get All Vehicles
    public List<UsedCar> findAll(){
        return usedCarRepository.findAll();
    }

    //Get Vehicle By Id
    public UsedCar findById(int id) {
        return usedCarRepository.findById(id);
    }
    //Optional<UsedCar>
    //Delete Vehicle
    public void delete(int id) {
        usedCarRepository.deleteById(id);
    }

    //Update Vehicle
    public void save(UsedCar usedCar) {
        usedCarRepository.save(usedCar);
    }

    public void update(UsedCar usedCar) {
        usedCarRepository.save(usedCar);
    }
}
