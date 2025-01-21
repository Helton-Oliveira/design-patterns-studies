package com.example.DesignPatternStudies.BehavioralPatterns.Strategy.code.step_01;

public class Taxi implements TransportStrategy {
    private final Double RATE_PER_KILOMETER = 0.5;
    private final Double RATE_PER_MINUTE = 2.00;
    private final Double APPROXIMATE_SPEED_OF_THE_TRACK = 50.0;

    @Override
    public void calculateFare(Double routeDistance) {
        var travelTime = (routeDistance / APPROXIMATE_SPEED_OF_THE_TRACK);
        var fare = (RATE_PER_MINUTE * (travelTime * 60)) + (routeDistance * RATE_PER_KILOMETER);
        System.out.printf("A tarifa cobrada de Taxi é de:  %.2f %n",  fare);
    }
}
