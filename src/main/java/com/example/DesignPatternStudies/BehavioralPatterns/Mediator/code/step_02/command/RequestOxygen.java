package com.example.DesignPatternStudies.BehavioralPatterns.Mediator.code.step_02.command;

import com.example.DesignPatternStudies.BehavioralPatterns.Mediator.code.step_02.Planet;

public class RequestOxygen implements Command{
    private final Planet planet;
    private final String stationName;

    public RequestOxygen(Planet planet, String request) {
        this.planet = planet;
        this.stationName = request;
    }

    @Override
    public int execute() {
        planet.requestReport(10, "oxygen", stationName);
        return planet.replenishOxygen();
    }
}
