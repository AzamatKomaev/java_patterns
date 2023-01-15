package com.azamat_komaev.patterns.creational.builder;

public class Director {
    SchoolBuilder builder;

    public void setBuilder(SchoolBuilder builder) {
        this.builder = builder;
    }

    School buildSchool() {
        builder.createSchool();
        builder.buildId();
        builder.buildClassesCount();
        builder.buildAddress();

        return builder.getSchool();
    }
}
