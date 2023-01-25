package com.azamat_komaev.patterns.behavioral.state;

public class Main {
    public static void doUserActions(User user) {
        user.viewPost();
        user.createPost();
        user.blockUser();
    }

    public static void main(String[] args) {
        System.out.println("Creating user with empty state...");
        User user = new User("Azamatik");

        System.out.println("Set user state to inactive");
        user.setState(new InactiveUserState());
        doUserActions(user);

        System.out.println("=======================================");

        System.out.println("Set user state to active");
        user.setState(new ActiveUserState());
        doUserActions(user);

        System.out.println("=======================================");

        System.out.println("Set user state to admin");
        user.setState(new AdminUserState());
        doUserActions(user);
    }
}
