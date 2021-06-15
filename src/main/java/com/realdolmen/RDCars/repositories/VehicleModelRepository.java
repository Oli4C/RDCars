package com.realdolmen.RDCars.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.realdolmen.RDCars.models.VehicleModel;

@Repository
public interface VehicleModelRepository extends JpaRepository<VehicleModel, Integer> {

}
