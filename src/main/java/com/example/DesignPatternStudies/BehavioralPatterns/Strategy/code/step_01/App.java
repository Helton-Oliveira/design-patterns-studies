package com.example.DesignPatternStudies.BehavioralPatterns.Strategy.code.step_01;

public class App {
    private final Transport transport;

    public App(Transport transport) {
        this.transport = transport;
    }

    public void requestTaxiFare(Double distance) {
        transport.setStrategy(new Taxi());
        transport.executeStrategy(distance);
    }

    public void requestBusPrice(Double distance) {
        transport.setStrategy(new Bus());
        transport.executeStrategy(distance);
    }

    public void requestMetroValue(Double distance) {
        transport.setStrategy(new Subway());
        transport.executeStrategy(distance);
    }
}
