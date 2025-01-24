package com.example.DesignPatternStudies.BehavioralPatterns.Strategy.code.step_02.State;

import com.example.DesignPatternStudies.BehavioralPatterns.Strategy.code.step_02.Strategy;

public abstract class Transport {
    protected TransportState state;
    protected Strategy strategy;

    public void calculateFare(Double routeDistance) {
        state.calculateFare(routeDistance);
    }

    public void available() {
        state.available();
    }

    public void underMaintenance(){
        state.underMaintenance();
    }

    public void setState(TransportState state) {
        this.state = state;
    }

    protected void setStrategy(Strategy strategy) {
        this.strategy = strategy;
        this.state = new Available(this, strategy);
    }
}
