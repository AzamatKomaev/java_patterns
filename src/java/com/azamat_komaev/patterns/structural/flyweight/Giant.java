package com.azamat_komaev.patterns.structural.flyweight;

public class Giant implements Hero {
    @Override
    public void walk() {
        System.out.println("The giant is walking...");
    }

    @Override
    public void jump() {
        System.out.println("The giant is jumping...");
    }
}
