package com.azamat_komaev.patterns.creational.builder;

public class BerlinSchoolBuilder extends SchoolBuilder {
    @Override
    void buildId() {
        school.setId(2);
    }

    @Override
    void buildClassesCount() {
        school.setClassesCount(20);
    }

    @Override
    void buildAddress() {
        school.setAddress("Bismarck street, 52");
    }
}
