package com.azamat_komaev.patterns.behavioral.observer;

public class Subscriber implements Observer {
    private final String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String title, String description) {
        System.out.println(name + " got news: " + title + ": " + description);
    }
}
