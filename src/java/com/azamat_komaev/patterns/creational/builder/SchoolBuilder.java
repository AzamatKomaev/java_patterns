package com.azamat_komaev.patterns.creational.builder;

public abstract class SchoolBuilder {
    School school;

    void createSchool() {
        school = new School();
    }

    abstract void buildId();
    abstract void buildClassesCount();
    abstract void buildAddress();

    School getSchool() {
        return school;
    }
}
