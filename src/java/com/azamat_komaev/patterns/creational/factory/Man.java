package com.azamat_komaev.patterns.creational.factory;

public class Man implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Hello, how are you?");
    }
}
