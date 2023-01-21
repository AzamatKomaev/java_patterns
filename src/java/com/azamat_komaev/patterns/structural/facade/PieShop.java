package com.azamat_komaev.patterns.structural.facade;

public class PieShop {
    Dispatcher dispatcher = new Dispatcher();
    PieFactory factory = new PieFactory();
    PieTransportation transportation = new PieTransportation();


    void buy() {
        dispatcher.getCall();
        dispatcher.processCall();
        dispatcher.transferOrderToFactory();

        factory.buyComponents();
        factory.preparePies();

        transportation.loadPiesIntoCar();
        transportation.unloadPiesFromCar();
    }
}
