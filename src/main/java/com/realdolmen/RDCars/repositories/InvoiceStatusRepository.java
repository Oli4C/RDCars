package com.realdolmen.RDCars.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.realdolmen.RDCars.models.InvoiceStatus;

@Repository
public interface InvoiceStatusRepository extends JpaRepository<InvoiceStatus, Integer> {

}
