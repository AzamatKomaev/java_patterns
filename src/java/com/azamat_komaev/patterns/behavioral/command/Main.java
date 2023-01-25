package com.azamat_komaev.patterns.behavioral.command;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        CarInvoker invoker = new CarInvoker();

        invoker.setCommand(new CarOpenDoorCommand(car));
        invoker.execute();

        invoker.setCommand(new CarCloseDoorCommand(car));
        invoker.execute();

        invoker.setCommand(new CarStartCommand(car));
        invoker.execute();
    }
}
