package com.example.DesignPatternStudies.BehavioralPatterns.Strategy.code.step_02.State;

public interface TransportState {
    void calculateFare(Double routeDistance);
    void available();
    void underMaintenance();
}
