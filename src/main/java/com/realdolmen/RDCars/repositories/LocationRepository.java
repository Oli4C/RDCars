package com.realdolmen.RDCars.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.realdolmen.RDCars.models.Location;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {

}
