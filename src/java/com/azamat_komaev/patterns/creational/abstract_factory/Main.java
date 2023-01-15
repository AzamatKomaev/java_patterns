package com.azamat_komaev.patterns.creational.abstract_factory;

import com.azamat_komaev.patterns.creational.abstract_factory.math.MathOnlineSchoolFactory;
import com.azamat_komaev.patterns.creational.abstract_factory.programming.JavaOnlineSchoolFactory;

public class Main {
    public static void main(String[] args) {
        OnlineSchoolFactory factory;

        Course course;
        Student student;
        Teacher teacher;

        factory = new JavaOnlineSchoolFactory();
        course = factory.getCourse();
        teacher = factory.getTeacher();
        student = factory.getStudent();

        course.getLessons();
        teacher.teach();
        student.study();

        System.out.println();

        factory = new MathOnlineSchoolFactory();
        course = factory.getCourse();
        teacher = factory.getTeacher();
        student = factory.getStudent();

        course.getLessons();
        teacher.teach();
        student.study();
    }
}
