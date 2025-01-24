package com.example.DesignPatternStudies.BehavioralPatterns.Strategy.code.step_02.State;

import com.example.DesignPatternStudies.BehavioralPatterns.Strategy.code.step_02.Strategy;

public class Available implements TransportState {
   private final Transport state;
   private final Strategy strategy;

    public Available(Transport transport, Strategy strategy) {
        this.state = transport;
        this.strategy = strategy;
    }

    @Override
    public void calculateFare(Double routeDistance) {
        strategy.execute(routeDistance);
    }

    @Override
    public void available() {
        System.out.println("Transporte ja está em estado disponível");
    }

    @Override
    public void underMaintenance() {
        state.setState(new UnderMaintenance(state, strategy));
    }
}
