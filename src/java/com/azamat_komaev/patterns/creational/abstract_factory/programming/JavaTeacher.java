package com.azamat_komaev.patterns.creational.abstract_factory.programming;

import com.azamat_komaev.patterns.creational.abstract_factory.Teacher;

public class JavaTeacher implements Teacher {
    @Override
    public void teach() {
        System.out.println("Teach students to write code in Java...");
    }
}
