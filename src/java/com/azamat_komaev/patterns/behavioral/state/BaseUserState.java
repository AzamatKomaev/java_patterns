package com.azamat_komaev.patterns.behavioral.state;

public class BaseUserState implements UserState {
    @Override
    public boolean canViewPost() {
        return true;
    }

    @Override
    public boolean canCreatePost() {
        return false;
    }

    @Override
    public boolean canBlockUser() {
        return false;
    }
}
