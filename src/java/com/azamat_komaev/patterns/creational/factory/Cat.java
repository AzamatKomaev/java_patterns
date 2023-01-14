package com.azamat_komaev.patterns.creational.factory;

public class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow, meow, meow");
    }
}
