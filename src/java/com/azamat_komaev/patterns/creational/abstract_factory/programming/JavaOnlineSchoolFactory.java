package com.azamat_komaev.patterns.creational.abstract_factory.programming;

import com.azamat_komaev.patterns.creational.abstract_factory.Course;
import com.azamat_komaev.patterns.creational.abstract_factory.OnlineSchoolFactory;
import com.azamat_komaev.patterns.creational.abstract_factory.Student;
import com.azamat_komaev.patterns.creational.abstract_factory.Teacher;

public class JavaOnlineSchoolFactory implements OnlineSchoolFactory {
    @Override
    public Teacher getTeacher() {
        return new JavaTeacher();
    }

    @Override
    public Student getStudent() {
        return new JavaStudent();
    }

    @Override
    public Course getCourse() {
        return new JavaCourse();
    }
}
