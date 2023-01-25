package com.azamat_komaev.patterns.behavioral.strategy;

public class MailSender implements Strategy {
    @Override
    public void send(String message, String to) {
        System.out.println("Send message via mail of Russia with content: " + message + ", to " + to);
    }
}
