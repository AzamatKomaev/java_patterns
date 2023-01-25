package com.azamat_komaev.patterns.behavioral.template_method;

public class Main {
    public static void main(String[] args) {
        Game football = new Football();
        football.play();

        System.out.println("===================================");

        Game overwatch = new Overwatch();
        overwatch.play();
    }
}
