package com.azamat_komaev.patterns.behavioral.template_method;

public class Football extends Game {
    @Override
    void setPlayers() {
        System.out.println("Setting football players...");
    }

    @Override
    void takeBreak() {
        System.out.println("Taking break for football match...");
    }

    @Override
    void getResults() {
        System.out.println("Getting winner of the match...");
    }
}
