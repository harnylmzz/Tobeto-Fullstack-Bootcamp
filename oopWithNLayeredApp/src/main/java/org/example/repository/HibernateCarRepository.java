package org.example.repository;

import org.example.entities.Car;

public class HibernateCarRepository implements CarRepository{
    @Override
    public void add(Car car) {
        System.out.println("Hibernate ile eklendi.");
    }

    @Override
    public void delete(int id) {
        System.out.println("Hibernate ile silindi.");
    }

    @Override
    public void update(Car car) {
        System.out.println("Hibernate ile güncellendi.");
    }
}
