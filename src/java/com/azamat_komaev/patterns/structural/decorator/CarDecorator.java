package com.azamat_komaev.patterns.structural.decorator;

public class CarDecorator implements Car {
    protected Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void start() {
        car.start();
    }

    @Override
    public void shutdown() {
        car.shutdown();
    }
}
