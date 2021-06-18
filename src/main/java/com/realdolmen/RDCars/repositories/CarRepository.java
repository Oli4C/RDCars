package com.realdolmen.RDCars.repositories;

import com.realdolmen.RDCars.models.Car;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class CarRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Car> findAll() {
        TypedQuery<Car> car = entityManager.createQuery("select e from Car e", Car.class);
        return car.getResultList();
    }

    @Transactional(rollbackOn = Exception.class)
    public void save(Car car) {
        entityManager.persist(car);
    }

    public Car findById(int id) {
        return entityManager.find(Car.class, id);
    }

    @Transactional
    public void update(Car car) {
        entityManager.merge(car);
    }
    @Transactional
    public void deleteById(int id) {
        Car car = findById(id);
        entityManager.remove(car);
    }
}
