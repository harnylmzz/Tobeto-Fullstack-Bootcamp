package org.example.business;

import org.example.core.logging.Logger;
import org.example.entities.Car;
import org.example.repository.CarRepository;

public class CarManager {

    private CarRepository carRepository;
    private Logger[] loggers;

    public CarManager(CarRepository carRepository, Logger[] loggers) {
        this.carRepository = carRepository;
        this.loggers = loggers;
    }

    public void add(Car car) {
        if (car.getYear() >= 2000 && car.getPrice() > 0) {
            carRepository.add(car);
            for (Logger logger: loggers
                 ) {
                logger.log(car.getBrand());
            }

        } else {
            System.out.println("Araç eklenemedi. Lütfen tekrar kontrol ediniz!");
        }
    }

    public void delete(int id) {
        carRepository.delete(id);
        System.out.println("Araç başarıyla silindi.");
    }

    public void update(Car car) {
        carRepository.update(car);
        System.out.println("Araç bilgileri güncellendi!");
    }


}
