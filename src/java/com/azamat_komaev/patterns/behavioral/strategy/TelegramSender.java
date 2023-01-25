package com.azamat_komaev.patterns.behavioral.strategy;

public class TelegramSender implements Strategy {
    @Override
    public void send(String message, String to) {
        System.out.println("Send message via Telegram with content: " + message + ", to " + to);
    }
}
