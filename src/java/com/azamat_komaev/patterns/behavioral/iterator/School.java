package com.azamat_komaev.patterns.behavioral.iterator;

import java.util.Iterator;

public record School(String name, String[] students) {
    public Iterator<String> getIterator() {
        return new StudentIterator(students);
    }
}
