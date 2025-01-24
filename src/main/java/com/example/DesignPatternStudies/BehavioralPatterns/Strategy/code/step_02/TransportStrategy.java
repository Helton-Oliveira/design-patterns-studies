package com.example.DesignPatternStudies.BehavioralPatterns.Strategy.code.step_02;


import com.example.DesignPatternStudies.BehavioralPatterns.Strategy.code.step_02.State.Transport;

public class TransportStrategy {
    private Transport transport;

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public void executeStrategy(Double routeDistance) {
        transport.calculateFare(routeDistance);
    }
}
