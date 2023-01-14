package com.azamat_komaev.patterns.creational.factory;

public class Main {
    public static void main(String[] args) {
        AnimalFactory factory = new ManFactory();
        Animal animal = factory.createAnimal();
        animal.makeSound();
    }
}
