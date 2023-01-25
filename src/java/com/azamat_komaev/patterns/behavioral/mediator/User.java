package com.azamat_komaev.patterns.behavioral.mediator;

public class User {
    private String name;
    private Room room;

    public User(String name, Room room) {
        this.name = name;
        this.room = room;
    }

    public void send(String message, User to) {
        room.send(message, this, to);
    }

    public void receive(String message, User from) {
        System.out.println(from.getName() + " sends message to " + this.name + ": " + message);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
