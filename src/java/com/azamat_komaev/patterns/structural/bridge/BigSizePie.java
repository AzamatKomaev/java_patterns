package com.azamat_komaev.patterns.structural.bridge;

public class BigSizePie implements PieSize {
    @Override
    public Integer getSize() {
        return 2;
    }
}
