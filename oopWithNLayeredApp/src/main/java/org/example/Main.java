package org.example;

import org.example.business.CarManager;
import org.example.core.logging.DatabaseLogger;
import org.example.core.logging.Logger;
import org.example.core.logging.MailLogger;
import org.example.core.logging.SmsLogger;
import org.example.entities.Car;
import org.example.repository.CarRepository;
import org.example.repository.HibernateCarRepository;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Araçları listeleme
        List<Car> cars = new ArrayList<>();

        //Araç üretme
        Car car1 = new Car(1, "Tesla", "26TESLA26", 2022, 1.250000);
        Car car2 = new Car(2, "Mercedes", "26MERCEDES26", 2023, 1.350000);
        Car car3 = new Car(3, "Audi", "26AUDI26", 2020, 1.450000);
        Car car4 = new Car(4, "Tofaş", "26TOFAS26", 2000, 1.500000);
        Car car5 = new Car(5, "Togg", "26TOGG26", 2021, 1.600000);

        //Listeye araç ekleme
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        //Araçları liste üzerinde gezme
        for (Car car : cars
        ) {
            System.out.println(" Araç markası: '" + car.getBrand() + "' fiyatı: '" + car.getPrice() + "' modeli: '" + car.getYear() + "' ");
        }

        System.out.println("---------------------------------------------------");

        //Loglama
        Logger[] loggers = {new DatabaseLogger()};

        CarManager carManager = new CarManager(new HibernateCarRepository(), loggers);
        carManager.add(car4);


    }
}