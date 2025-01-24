package com.example.DesignPatternStudies.BehavioralPatterns.Strategy.code.step_02.State;

import com.example.DesignPatternStudies.BehavioralPatterns.Strategy.code.step_02.Strategy;

public class UnderMaintenance implements TransportState{
   private final Transport state;
   private final Strategy strategy;

    public UnderMaintenance(Transport transport, Strategy strategy) {
        this.state = transport;
        this.strategy = strategy;
    }

    @Override
    public void calculateFare(Double routeDistance) {
     System.out.println("Impossível realizar calculo de tarifa, pois este meio de transporte está em manutenção");
    }

    @Override
    public void available() {
      state.setState(new Available(state, strategy));
    }

    @Override
    public void underMaintenance() {
     System.out.println("Transporte já esta em estado de manutenção");
    }
}
