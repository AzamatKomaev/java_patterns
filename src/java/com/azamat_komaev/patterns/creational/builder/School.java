package com.azamat_komaev.patterns.creational.builder;

public class School {
    private int id;
    private int classesCount;
    private String address;

    public void setId(int id) {
        this.id = id;
    }

    public void setClassesCount(int classesCount) {
        this.classesCount = classesCount;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "School{" +
            "id=" + id +
            ", classesCount=" + classesCount +
            ", address='" + address + '\'' +
            '}';
    }
}
