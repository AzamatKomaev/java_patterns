package com.azamat_komaev.patterns.creational.prototype;

public record User(String firstName, String lastName, int age) implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        User copy = new User(firstName, lastName, age);
        return copy;
    }
}
