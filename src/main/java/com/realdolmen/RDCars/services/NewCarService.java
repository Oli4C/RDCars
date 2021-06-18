package com.realdolmen.RDCars.services;


import com.realdolmen.RDCars.models.NewCar;
import com.realdolmen.RDCars.repositories.NewCarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NewCarService {

    @Autowired
    private NewCarRepository newCarRepository;

    //Get All Vehicles
    public List<NewCar> findAll(){
        return newCarRepository.findAll();
    }

    //Get Vehicle By Id
    public NewCar findById(int id) {
        return newCarRepository.findById(id);
    }
    //Optional<NewCar>
    //Delete Vehicle
    public void delete(int id) {
        newCarRepository.deleteById(id);
    }

    //Update Vehicle
    public void save(NewCar newCar) {
        newCarRepository.save(newCar);
    }

    public void update(NewCar newCar) {
        newCarRepository.save(newCar);
    }
}
