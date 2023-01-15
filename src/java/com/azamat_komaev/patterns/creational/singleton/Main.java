package com.azamat_komaev.patterns.creational.singleton;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Counter.getCounter().increment(); // 5
        }

        Counter.getCounter().decrement(); // 4
        Counter.getCounter().decrement(); // 3

        System.out.println(Counter.getCounter().getValue());
    }
}
