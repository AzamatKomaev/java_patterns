package com.azamat_komaev.patterns.behavioral.command;

public class CarOpenDoorCommand implements Command {
    Car car;

    public CarOpenDoorCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.openDoor();
    }
}
