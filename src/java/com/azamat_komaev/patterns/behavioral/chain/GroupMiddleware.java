package com.azamat_komaev.patterns.behavioral.chain;

public class GroupMiddleware extends Middleware {
    public GroupMiddleware(Middleware nextMiddleware) {
        this.nextMiddleware = nextMiddleware;
    }

    @Override
    void checkRequest(Request request) {
        if (!request.group().equals("superuser")) {
            throw new RuntimeException("You are not member of superuser group!");
        }

        if (nextMiddleware != null) {
            nextMiddleware.checkRequest(request);
        }
    }
}
