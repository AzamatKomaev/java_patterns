package com.azamat_komaev.patterns.behavioral.chain;

public record Request(boolean isAuth, String username, String group) {
}