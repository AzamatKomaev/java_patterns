package com.azamat_komaev.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Newspaper {
    private List<News> newsList;
    private List<Observer> subscribers;

    public Newspaper() {
        this.newsList = new ArrayList<>();
        this.subscribers = new ArrayList<>();
    }

    public void registerSubscriber(Observer subscriber) {
        subscribers.add(subscriber);
    }

    public void notifySubscribers(News newsToNotify) {
        subscribers.forEach((Observer subscriber) -> {
            subscriber.update(newsToNotify.getTitle(), newsToNotify.getDescription());
        });
    }

    public void addNews(News news) {
        newsList.add(news);
        notifySubscribers(news);
    }
}
