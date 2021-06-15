package com.realdolmen.RDCars.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.realdolmen.RDCars.models.VehicleHire;

@Repository
public interface VehicleHireRepository extends JpaRepository<VehicleHire, Integer> {

}
