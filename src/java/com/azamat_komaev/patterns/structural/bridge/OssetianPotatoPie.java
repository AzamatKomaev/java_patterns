package com.azamat_komaev.patterns.structural.bridge;

public class OssetianPotatoPie extends OssetianPie {
    public OssetianPotatoPie(PieSize size) {
        super(size);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing pie with potato...");
    }
}
