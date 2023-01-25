package com.azamat_komaev.patterns.behavioral.chain;

public abstract class Middleware {
    Middleware nextMiddleware;

    abstract void checkRequest(Request request);
}
