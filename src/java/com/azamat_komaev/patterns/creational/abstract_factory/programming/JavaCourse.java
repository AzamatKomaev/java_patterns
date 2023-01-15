package com.azamat_komaev.patterns.creational.abstract_factory.programming;

import com.azamat_komaev.patterns.creational.abstract_factory.Course;

public class JavaCourse implements Course {
    @Override
    public void getLessons() {
        System.out.println("Get lessons from Java course...");
    }
}
