package com.azamat_komaev.patterns.behavioral.iterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        String[] students = {"Azamat Komaev", "Michael Romanov", "Vladimir Vladimirovich"};
        School school = new School("Vladikavkaz school number 6", students);
        Iterator<String> iterator = school.getIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
