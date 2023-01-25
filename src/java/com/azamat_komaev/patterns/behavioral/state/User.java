package com.azamat_komaev.patterns.behavioral.state;

public class User {
    private UserState state;
    private final String name;

    public User(String name) {
        this.name = name;
    }

    public void setState(UserState state) {
        this.state = state;
    }

    public void viewPost() {
        if (!state.canViewPost()) {
            System.out.println("You cannot view the post!");
            return;
        }
        System.out.println("You successfully viewed the post!");
    }

    public void createPost() {
        if (!state.canCreatePost()) {
            System.out.println("You cannot create new post!");
            return;
        }
        System.out.println("You successfully created the post");
    }

    public void blockUser() {
        if (!state.canBlockUser()) {
            System.out.println("You cannot block the user!");
            return;
        }
        System.out.println("You successfully blocked the user!");
    }
}
