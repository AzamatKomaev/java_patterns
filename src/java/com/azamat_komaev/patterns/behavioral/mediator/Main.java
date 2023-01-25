package com.azamat_komaev.patterns.behavioral.mediator;

public class Main {
    public static void main(String[] args) {
        Room chatRoom = new Room();

        User user1 = new User("Azamat", chatRoom);
        User user2 = new User("David", chatRoom);
        User user3 = new User("Vladimir", chatRoom);

        chatRoom.register(user1);
        chatRoom.register(user2);
        chatRoom.register(user3);

        chatRoom.send("Hello, Azamat!", user1, user2);
        chatRoom.send("Hello, how are you?", user3, user2);
        chatRoom.send("Hello everybody!", user2, null);
    }
}
