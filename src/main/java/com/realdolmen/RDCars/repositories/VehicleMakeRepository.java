package com.realdolmen.RDCars.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.realdolmen.RDCars.models.VehicleMake;

@Repository
public interface VehicleMakeRepository extends JpaRepository<VehicleMake, Integer> {

}
