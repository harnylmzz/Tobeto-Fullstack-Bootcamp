package org.example.repository;

import org.example.entities.Car;

import java.util.List;

public interface CarRepository {

    void add(Car car);

    void delete(int id);

    void update(Car car);
}
