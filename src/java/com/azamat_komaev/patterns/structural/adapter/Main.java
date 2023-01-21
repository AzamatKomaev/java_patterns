package com.azamat_komaev.patterns.structural.adapter;

/*
    We have Requester class with sendRequest method.
    So, out task is to interface Sender to interact with that class
    But we should not modify Requester class, so we created Adapter.
*/

public class Main {
    public static void main(String[] args) {
        Sender sender = new Adapter();
        sender.send();
    }
}

