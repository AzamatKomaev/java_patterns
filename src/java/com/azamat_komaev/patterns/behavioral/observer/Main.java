package com.azamat_komaev.patterns.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        Newspaper newspaper = new Newspaper();

        Observer subscriber1 = new Subscriber("Azamat");
        Observer subscriber2 = new Subscriber("Vladimir");
        Observer subscriber3 = new Subscriber("Joe");

        newspaper.registerSubscriber(subscriber1);
        newspaper.registerSubscriber(subscriber2);
        newspaper.registerSubscriber(subscriber3);

        News firstNews = new News("First title", "First description");
        News secondNews = new News("Second title", "Second description");

        newspaper.addNews(firstNews);
        System.out.println("======================================");
        newspaper.addNews(secondNews);
    }
}
