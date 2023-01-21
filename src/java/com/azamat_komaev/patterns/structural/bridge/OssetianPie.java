package com.azamat_komaev.patterns.structural.bridge;

public abstract class OssetianPie {
    protected PieSize size;

    public OssetianPie(PieSize size) {
        this.size = size;
    }

    public abstract void prepare();
}
