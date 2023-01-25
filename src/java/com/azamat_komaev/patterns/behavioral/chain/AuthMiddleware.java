package com.azamat_komaev.patterns.behavioral.chain;

public class AuthMiddleware extends Middleware {
    public AuthMiddleware(Middleware nextMiddleware) {
        this.nextMiddleware = nextMiddleware;
    }

    @Override
    void checkRequest(Request request) {
        if (!request.isAuth()) {
            throw new RuntimeException("You are not authorized!");
        }

        if (nextMiddleware != null) {
            nextMiddleware.checkRequest(request);
        }
    }
}
