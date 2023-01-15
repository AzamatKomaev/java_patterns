package com.azamat_komaev.patterns.creational.abstract_factory.programming;

import com.azamat_komaev.patterns.creational.abstract_factory.Student;

public class JavaStudent implements Student {
    @Override
    public void study() {
        System.out.println("Study Java...");
    }
}
