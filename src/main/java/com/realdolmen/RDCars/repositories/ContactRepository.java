package com.realdolmen.RDCars.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.realdolmen.RDCars.models.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}