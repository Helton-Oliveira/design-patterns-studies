package com.example.DesignPatternStudies.BehavioralPatterns.Strategy.code.step_02;

import com.example.DesignPatternStudies.BehavioralPatterns.Strategy.code.step_02.State.Transport;

public class Subway extends Transport implements Strategy {
    public Subway() {
        setStrategy(this);
    }

    @Override
    public void execute(Double routeDistance) {
        Double RATE_PER_KILOMETER = 0.3;
        System.out.println("A tarifa cobrada do metro é de: " + routeDistance * RATE_PER_KILOMETER);
    }
}
