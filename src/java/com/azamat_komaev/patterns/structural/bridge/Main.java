package com.azamat_komaev.patterns.structural.bridge;

public class Main {
    public static void main(String[] args) {
        OssetianPie meatPie = new OssetianMeatPie(new BigSizePie());
        OssetianPie cheesePie = new OssetianCheesePie(new MediumPieSize());
        OssetianPie potatoPie = new OssetianPotatoPie(new LittlePieSize());
    }
}
