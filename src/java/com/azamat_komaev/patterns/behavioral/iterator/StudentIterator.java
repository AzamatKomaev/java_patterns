package com.azamat_komaev.patterns.behavioral.iterator;

import java.util.Iterator;

public class StudentIterator implements Iterator<String> {
    private int index;
    private String[] students;


    public StudentIterator(String[] students) {
        this.students = students;
    }

    @Override
    public boolean hasNext() {
        return index < students.length;
    }

    @Override
    public String next() {
        return students[index++];
    }
}
