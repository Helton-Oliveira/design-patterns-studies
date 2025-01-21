package com.example.DesignPatternStudies.BehavioralPatterns.Strategy.code.step_01;

public class Subway implements TransportStrategy {
    private final Double RATE_PER_KILOMETER = 0.5;

    @Override
    public void calculateFare(Double routeDistance) {
        System.out.println("A tarifa cobrada de metrô é de: " + routeDistance * RATE_PER_KILOMETER);
    }
}
