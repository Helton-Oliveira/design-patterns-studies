package com.example.DesignPatternStudies.BehavioralPatterns.Strategy.code.step_01;

public class Transport {
    private TransportStrategy strategy;

    public void setStrategy(TransportStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(Double routeDistance) {
        strategy.calculateFare(routeDistance);
    }
}
