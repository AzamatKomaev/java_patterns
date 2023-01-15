package com.azamat_komaev.patterns.creational.builder;

public class MoscowSchoolBuilder extends SchoolBuilder {
    @Override
    void buildId() {
        school.setId(1);
    }

    @Override
    void buildClassesCount() {
        school.setClassesCount(35);
    }

    @Override
    void buildAddress() {
        school.setAddress("Lenin street, 26");
    }
}
