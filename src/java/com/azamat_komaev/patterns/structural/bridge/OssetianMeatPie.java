package com.azamat_komaev.patterns.structural.bridge;

public class OssetianMeatPie extends OssetianPie {
    public OssetianMeatPie(PieSize size) {
        super(size);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing pie with meat...");
    }
}
