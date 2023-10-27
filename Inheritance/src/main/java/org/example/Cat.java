package org.example;

public class Cat implements AnimalService{
    @Override
    public void makeSound() {
        System.out.println("Miyav");
    }
}
