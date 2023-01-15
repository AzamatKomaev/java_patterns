package com.azamat_komaev.patterns.creational.abstract_factory.math;

import com.azamat_komaev.patterns.creational.abstract_factory.Student;

public class MathStudent implements Student {
    @Override
    public void study() {
        System.out.println("Study math...");
    }
}
