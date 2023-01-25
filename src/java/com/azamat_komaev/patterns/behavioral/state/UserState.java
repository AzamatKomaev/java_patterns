package com.azamat_komaev.patterns.behavioral.state;

public interface UserState {
    boolean canViewPost();
    boolean canCreatePost();
    boolean canBlockUser();
}
