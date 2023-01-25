package com.azamat_komaev.patterns.behavioral.template_method;

public abstract class Game {
    public void play() {
        setPlayers();
        start();
        takeBreak();
        finish();
        getResults();
    }

    public void start() {
        System.out.println("Starting the game...");
    }

    public void finish() {
        System.out.println("Finishing the game...");
    }

    abstract void setPlayers();
    abstract void takeBreak();
    abstract void getResults();

}
