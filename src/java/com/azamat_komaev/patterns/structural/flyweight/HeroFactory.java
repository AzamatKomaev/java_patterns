package com.azamat_komaev.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class HeroFactory {
    private static final Map<String, Hero> heroes = new HashMap<>();

    public Hero getHero(String name) {
        Hero hero = heroes.get(name);

        if (hero == null) {
            switch (name) {
                case "knight" -> hero = new Knight();
                case "giant" -> hero = new Giant();
            }
            heroes.put(name, hero);
        }

        return hero;
    }
}
