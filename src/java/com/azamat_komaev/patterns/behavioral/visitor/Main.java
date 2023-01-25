package com.azamat_komaev.patterns.behavioral.visitor;

public class Main {
    public static void main(String[] args) {
        User user = new User("Azamat Komaev", 16);

        UserNamePrinter namePrinter = new UserNamePrinter();
        UserAgePrinter agePrinter = new UserAgePrinter();
        UserFullInfoPrinter fullInfoPrinter = new UserFullInfoPrinter();

        user.accept(namePrinter);
        user.accept(agePrinter);
        user.accept(fullInfoPrinter);
    }
}
