package com.azamat_komaev.patterns.structural.decorator;

public class Jeep implements Car {
    @Override
    public void start() {
        System.out.println("Start the jeep");
    }

    @Override
    public void shutdown() {
        System.out.println("Shutdown the jeep");
    }
}
