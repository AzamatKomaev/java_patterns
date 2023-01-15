package com.azamat_komaev.patterns.creational.abstract_factory.math;

import com.azamat_komaev.patterns.creational.abstract_factory.Course;
import com.azamat_komaev.patterns.creational.abstract_factory.OnlineSchoolFactory;
import com.azamat_komaev.patterns.creational.abstract_factory.Student;
import com.azamat_komaev.patterns.creational.abstract_factory.Teacher;

public class MathOnlineSchoolFactory implements OnlineSchoolFactory {
    @Override
    public Teacher getTeacher() {
        return new MathTeacher();
    }

    @Override
    public Student getStudent() {
        return new MathStudent();
    }

    @Override
    public Course getCourse() {
        return new MathCourse();
    }
}
