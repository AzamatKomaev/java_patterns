package com.azamat_komaev.patterns.structural.decorator;

public class Truck implements Car {
    @Override
    public void start() {
        System.out.println("Start the truck");
    }

    @Override
    public void shutdown() {
        System.out.println("Shutdown the truck");
    }
}
