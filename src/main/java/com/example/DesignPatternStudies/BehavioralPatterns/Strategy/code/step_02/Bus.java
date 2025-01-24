package com.example.DesignPatternStudies.BehavioralPatterns.Strategy.code.step_02;

import com.example.DesignPatternStudies.BehavioralPatterns.Strategy.code.step_02.State.Transport;

public class Bus extends Transport implements Strategy {
    public Bus() {
        setStrategy(this);
    }

    @Override
    public void execute(Double routeDistance) {
        Double RATE_PER_KILOMETER = 0.3;
        System.out.println("A tarifa cobrada do ônibus é de: " + routeDistance * RATE_PER_KILOMETER);
    }
}
