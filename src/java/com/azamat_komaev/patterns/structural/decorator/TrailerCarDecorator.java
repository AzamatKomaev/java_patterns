package com.azamat_komaev.patterns.structural.decorator;

public class TrailerCarDecorator extends CarDecorator {
    public TrailerCarDecorator(Car car) {
        super(car);
    }

    private void addTrailer() {
        System.out.println("Add trailer to the car");
    }

    @Override
    public void start() {
        addTrailer();
        super.start();
    }

    @Override
    public void shutdown() {
        super.shutdown();
    }
}
