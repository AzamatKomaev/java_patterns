package com.azamat_komaev.patterns.creational.prototype;

public class UserFactory {
    User user;

    public UserFactory(User user) {
        this.user = user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    User cloneUser() throws CloneNotSupportedException {
        return (User) user.clone();
    }
}
