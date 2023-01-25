package com.azamat_komaev.patterns.behavioral.template_method;

public class Overwatch extends Game {
    @Override
    void setPlayers() {
        System.out.println("Setting players in your team in Overwatch...");
    }

    @Override
    void takeBreak() {
        System.out.println("Taking break in Overwatch match...");
    }

    @Override
    void getResults() {
        System.out.println("Getting winner of the Overwatch match...");
    }
}
