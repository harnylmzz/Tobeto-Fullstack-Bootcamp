package org.example;

public class Bird extends Animal{

    @Override
    public void makeSound() {

    }

    @Override
    public void eat() {
        System.out.println("Bird can eat.");

    }

    @Override
    public void breathe() {
        System.out.println("Bird can breathe.");
    }

    public void fly() {
        System.out.println("Bird is fly.");
    }
}
