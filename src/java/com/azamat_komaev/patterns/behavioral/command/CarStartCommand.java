package com.azamat_komaev.patterns.behavioral.command;

public class CarStartCommand implements Command {
    Car car;

    public CarStartCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.start();
    }
}
