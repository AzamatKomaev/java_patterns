package com.azamat_komaev.patterns.creational.singleton;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    private static Counter counter;
    private static final AtomicInteger value = new AtomicInteger(0);

    public static synchronized Counter getCounter() {
        if (counter == null) {
            counter = new Counter();
        }

        return counter;
    }

    private Counter() {

    }

    public void increment() {
        value.incrementAndGet();
    }

    public void decrement() {
        value.decrementAndGet();
    }

    public int getValue() {
        return value.intValue();
    }
}
