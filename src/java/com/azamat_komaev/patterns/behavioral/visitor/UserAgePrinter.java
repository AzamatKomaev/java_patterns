package com.azamat_komaev.patterns.behavioral.visitor;

class UserAgePrinter implements Visitor {
    @Override
    public void visit(User user) {
        System.out.println("User age: " + user.getAge());
    }
}
