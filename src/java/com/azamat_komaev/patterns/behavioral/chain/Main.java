package com.azamat_komaev.patterns.behavioral.chain;

public class Main {
    public static void main(String[] args) {
        Request validRequest = new Request(true, "Azamatik", "superuser");
        Request invalidRequest = new Request(true, "Azamatik", "moderator");

        Middleware usernameMiddleware = new UsernameMiddleware(null);
        Middleware groupMiddleware = new GroupMiddleware(usernameMiddleware);
        Middleware authMiddleware = new AuthMiddleware(groupMiddleware);

        authMiddleware.checkRequest(validRequest); // empty output
        authMiddleware.checkRequest(invalidRequest); // RuntimeException: You are not member of superuser group!
    }
}
