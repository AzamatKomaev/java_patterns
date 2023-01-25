package com.azamat_komaev.patterns.behavioral.command;

public class CarCloseDoorCommand implements Command {
    Car car;

    public CarCloseDoorCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.closeDoor();
    }
}
