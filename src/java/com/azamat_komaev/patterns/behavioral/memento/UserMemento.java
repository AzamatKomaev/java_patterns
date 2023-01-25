package com.azamat_komaev.patterns.behavioral.memento;

public class UserMemento {
    private final String firstName;
    private final String lastName;
    private final int age;

    public UserMemento(User user) {
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.age = user.getAge();
    }

    public User getSavedUser() {
        return new User(firstName, lastName, age);
    }
}
