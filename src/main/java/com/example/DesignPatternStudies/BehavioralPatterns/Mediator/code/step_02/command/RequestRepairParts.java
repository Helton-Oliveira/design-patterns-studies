package com.example.DesignPatternStudies.BehavioralPatterns.Mediator.code.step_02.command;

import com.example.DesignPatternStudies.BehavioralPatterns.Mediator.code.step_02.Planet;

public class RequestRepairParts implements Command{
    private final Planet planet;
    private final String stationName;

    public RequestRepairParts(Planet planet, String request) {
        this.planet = planet;
        this.stationName = request;
    }

    @Override
    public int execute() {
        planet.requestReport(10, "parts", stationName);
        return planet.replenishParts();
    }
}
