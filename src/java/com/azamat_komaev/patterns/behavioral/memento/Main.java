package com.azamat_komaev.patterns.behavioral.memento;

public class Main {
    public static void main(String[] args) {
        User user = new User("Azamat", "Komaev", 16);

        UserMemento state1 = user.saveToMemento();
        user.setAge(17);

        UserMemento state2 = user.saveToMemento();
        user.setFirstName("Vladimir");
        user.setLastName("Puskin");

        UserMemento state3 = user.saveToMemento();

        System.out.println(user);
        user.restoreFromMemento(state2);
        System.out.println(user);
        user.restoreFromMemento(state1);
        System.out.println(user);
    }
}
