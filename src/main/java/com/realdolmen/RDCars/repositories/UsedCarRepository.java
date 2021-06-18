package com.realdolmen.RDCars.repositories;

import com.realdolmen.RDCars.models.UsedCar;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class UsedCarRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<UsedCar> findAll() {
        TypedQuery<UsedCar> usedCar = entityManager.createQuery("select e from UsedCar e",UsedCar.class);
        return usedCar.getResultList();
    }

    @Transactional(rollbackOn = Exception.class)
    public void save(UsedCar usedCar) {
        entityManager.persist(usedCar);
    }

    public UsedCar findById(int id) {
        return entityManager.find(UsedCar.class, id);
    }

    @Transactional
    public void update(UsedCar usedCar) {
        entityManager.merge(usedCar);
    }
    @Transactional
    public void deleteById(int id) {
        UsedCar usedCar = findById(id);
        entityManager.remove(usedCar);
    }
}
