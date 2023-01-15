package com.azamat_komaev.patterns.creational.abstract_factory;

public interface OnlineSchoolFactory {
    Teacher getTeacher();
    Student getStudent();
    Course getCourse();
}
