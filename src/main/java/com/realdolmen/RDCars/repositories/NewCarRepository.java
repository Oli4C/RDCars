package com.realdolmen.RDCars.repositories;

import com.realdolmen.RDCars.models.Employee;
import com.realdolmen.RDCars.models.NewCar;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class NewCarRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<NewCar> findAll() {
        TypedQuery<NewCar> newCar = entityManager.createQuery("select e from NewCar e",NewCar.class);
        return newCar.getResultList();
    }

    @Transactional(rollbackOn = Exception.class)
    public void save(NewCar newCar) {
        entityManager.persist(newCar);
    }

    public NewCar findById(int id) {
        return entityManager.find(NewCar.class, id);
    }

    @Transactional
    public void update(NewCar newCar) {
        entityManager.merge(newCar);
    }
    @Transactional
    public void deleteById(int id) {
        NewCar newCar = findById(id);
        entityManager.remove(newCar);
    }
}
