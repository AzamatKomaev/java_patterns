package com.azamat_komaev.patterns.structural.bridge;

public class OssetianCheesePie extends OssetianPie {
    public OssetianCheesePie(PieSize size) {
        super(size);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing pie with cheese...");
    }
}
