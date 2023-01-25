package com.azamat_komaev.patterns.behavioral.visitor;

class UserNamePrinter implements Visitor {
    @Override
    public void visit(User user) {
        System.out.println("User name: " + user.getName());
    }
}
