package com.example.DesignPatternStudies.BehavioralPatterns.Strategy.code.step_02;


import com.example.DesignPatternStudies.BehavioralPatterns.Strategy.code.step_02.State.Transport;

public class TransportStrategy {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(Double routeDistance) {
        var transport = (Transport) strategy;
        transport.calculateFare(routeDistance);
    }
}
