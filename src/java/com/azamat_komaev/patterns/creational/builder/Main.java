package com.azamat_komaev.patterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        School school;
        Director director = new Director(); // not a school director, but director to build school

        director.setBuilder(new MoscowSchoolBuilder());
        school = director.buildSchool();
        System.out.println(school);

        director.setBuilder(new BerlinSchoolBuilder());
        school = director.buildSchool();
        System.out.println(school);
    }
}
