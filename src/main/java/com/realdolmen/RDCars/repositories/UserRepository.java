package com.realdolmen.RDCars.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.realdolmen.RDCars.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUsername(String username);
	
}
