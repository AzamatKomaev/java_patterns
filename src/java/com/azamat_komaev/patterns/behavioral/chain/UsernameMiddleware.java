package com.azamat_komaev.patterns.behavioral.chain;

public class UsernameMiddleware extends Middleware {
    public UsernameMiddleware(Middleware nextMiddleware) {
        this.nextMiddleware = nextMiddleware;
    }

    @Override
    void checkRequest(Request request) {
        if (!request.username().equals("Azamatik")) {
            throw new RuntimeException("You are not admin!");
        }

        if (nextMiddleware != null) {
            nextMiddleware.checkRequest(request);
        }
    }
}
