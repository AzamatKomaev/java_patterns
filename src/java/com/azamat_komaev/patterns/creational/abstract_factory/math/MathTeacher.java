package com.azamat_komaev.patterns.creational.abstract_factory.math;

import com.azamat_komaev.patterns.creational.abstract_factory.Teacher;

public class MathTeacher implements Teacher {
    @Override
    public void teach() {
        System.out.println("Teach students math...");
    }
}
