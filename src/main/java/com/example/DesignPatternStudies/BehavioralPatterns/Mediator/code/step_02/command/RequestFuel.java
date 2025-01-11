package com.example.DesignPatternStudies.BehavioralPatterns.Mediator.code.step_02.command;

import com.example.DesignPatternStudies.BehavioralPatterns.Mediator.code.step_02.Planet;

public class RequestFuel implements Command{
    private final Planet planet;
    private final String stationName;

    public RequestFuel(Planet planet, String stationName) {
        this.planet = planet;
        this.stationName = stationName;
    }

    @Override
    public int execute() {
        planet.requestReport(10, "fuel", stationName);
        return planet.replenishFuelResource();
    }
}
