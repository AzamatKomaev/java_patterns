package com.azamat_komaev.patterns.behavioral.mediator;

import java.util.HashMap;
import java.util.Map;

public class Room {
    Map<String, User> users;

    public Room() {
        users = new HashMap<>();
    }

    public void register(User user) {
        users.put(user.getName(), user);
        user.setRoom(this);
    }

    public void send(String message, User from, User to) {
        if (to != null) {
            to.receive(message, from);
            return;
        }

        for (String userName: users.keySet()) {
            if (!users.get(userName).equals(from)) {
                users.get(userName).receive(message, from);
            }
        }
    }
}
