package com.azamat_komaev.patterns.structural.adapter;

public class Adapter implements Sender {
    Requester requester = new Requester();

    @Override
    public void send() {
        requester.sendRequest();
    }
}
