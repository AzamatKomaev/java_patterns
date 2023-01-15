package com.azamat_komaev.patterns.creational.abstract_factory.math;

import com.azamat_komaev.patterns.creational.abstract_factory.Course;

public class MathCourse implements Course {
    @Override
    public void getLessons() {
        System.out.println("Get lessons from math course...");
    }
}
