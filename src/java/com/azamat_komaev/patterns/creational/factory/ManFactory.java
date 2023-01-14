package com.azamat_komaev.patterns.creational.factory;

public class ManFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Man();
    }
}
