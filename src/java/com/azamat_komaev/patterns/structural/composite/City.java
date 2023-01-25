package com.azamat_komaev.patterns.structural.composite;

public class City extends CountryComponent {
    String name;

    public City(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    @Override
    void print() {
        System.out.print(" " + getName());
    }
}
