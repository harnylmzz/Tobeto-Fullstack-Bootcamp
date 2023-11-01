package org.example;

public class Dog  extends Animal{

    public void bark() {

    }

    @Override
    public void makeSound() {
        System.out.println("hırrrrrrrrrrrrrr");
    }

    @Override
    public void eat() {
        System.out.println("Dog can eat.");
    }

    @Override
    public void breathe() {
        System.out.println("Dog can eat.");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
