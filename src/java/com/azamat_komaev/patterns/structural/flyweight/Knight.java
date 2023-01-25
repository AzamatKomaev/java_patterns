package com.azamat_komaev.patterns.structural.flyweight;

public class Knight implements Hero {
    @Override
    public void walk() {
        System.out.println("The knight is walking...");
    }

    @Override
    public void jump() {
        System.out.println("The knight is jumping...");
    }
}
