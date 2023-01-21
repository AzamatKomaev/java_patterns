package com.azamat_komaev.patterns.structural.decorator;

public class TuningCarDecorator extends CarDecorator {
    public TuningCarDecorator(Car car) {
        super(car);
    }

    private void addTuning() {
        System.out.println("Add tuning to the car.");
    }

    @Override
    public void start() {
        addTuning();
        super.start();
    }

    @Override
    public void shutdown() {
        super.shutdown();
    }
}
