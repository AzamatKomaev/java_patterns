package com.azamat_komaev.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Country extends CountryComponent {
    List<CountryComponent> components = new ArrayList<>();
    String name;

    public Country(String name) {
        this.name = name;
    }

    @Override
    void add(CountryComponent country) {
        components.add(country);
    }

    @Override
    void remove(CountryComponent country) {
        components.remove(country);
    }

    String getName() {
        return name;
    }

    @Override
    void print() {
        System.out.println("\n" + getName());
        System.out.println("-------------------");
        for (CountryComponent component: components) {
            component.print();
        }
    }
}
