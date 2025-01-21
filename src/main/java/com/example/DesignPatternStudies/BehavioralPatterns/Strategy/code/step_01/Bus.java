package com.example.DesignPatternStudies.BehavioralPatterns.Strategy.code.step_01;

public class Bus implements TransportStrategy {
    private final Double RATE_PER_KILOMETER = 0.3;

    @Override
    public void calculateFare(Double routeDistance) {
        System.out.println("A tarifa cobrada do ônibus é de: " + routeDistance * RATE_PER_KILOMETER);
    }
}
