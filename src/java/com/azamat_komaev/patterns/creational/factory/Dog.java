package com.azamat_komaev.patterns.creational.factory;

public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Gav, gav, gav");
    }
}
