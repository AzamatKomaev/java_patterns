package com.azamat_komaev.patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HeroFactory factory = new HeroFactory();
        List<Hero> heroes = new ArrayList<>();

        // getHero() provides that the same Hero object will be used
        heroes.add(factory.getHero("knight"));
        heroes.add(factory.getHero("giant"));
    }
}
