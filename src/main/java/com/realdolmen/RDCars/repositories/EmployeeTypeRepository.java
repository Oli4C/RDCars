package com.realdolmen.RDCars.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.realdolmen.RDCars.models.EmployeeType;

@Repository
public interface EmployeeTypeRepository extends JpaRepository<EmployeeType, Integer> {

}
