package com.azamat_komaev.patterns.behavioral.command;

public class CarInvoker {
    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void execute() {
        command.execute();
    }
}
