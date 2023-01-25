package com.azamat_komaev.patterns.behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        context.setStrategy(new MailSender());
        context.executeStrategy("Hello!", "Azamat Komaev");

        context.setStrategy(new EmailSender());
        context.executeStrategy("How are you", "Vladimir");

        context.setStrategy(new TelegramSender());
        context.executeStrategy("I am fine!", "Azamat Komaev");
    }
}
