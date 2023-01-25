package com.azamat_komaev.patterns.behavioral.state;

public class AdminUserState implements UserState {
    @Override
    public boolean canViewPost() {
        return true;
    }

    @Override
    public boolean canCreatePost() {
        return true;
    }

    @Override
    public boolean canBlockUser() {
        return true;
    }
}
