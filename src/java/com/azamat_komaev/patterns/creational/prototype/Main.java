package com.azamat_komaev.patterns.creational.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User("Azamat", "Komaev", 16);

        System.out.println("Original: " + user);

        UserFactory factory = new UserFactory(user);
        User userCopy = factory.cloneUser();

        System.out.println("Copied: " + userCopy);
    }
}
