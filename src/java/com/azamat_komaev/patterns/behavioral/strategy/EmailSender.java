package com.azamat_komaev.patterns.behavioral.strategy;

public class EmailSender implements Strategy {
    @Override
    public void send(String message, String to) {
        System.out.println("Send message via email with content: " + message + ", to " + to);
    }
}
