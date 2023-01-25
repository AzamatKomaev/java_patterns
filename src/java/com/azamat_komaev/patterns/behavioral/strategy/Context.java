package com.azamat_komaev.patterns.behavioral.strategy;

public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(String message, String to) {
        strategy.send(message, to);
    }
}
