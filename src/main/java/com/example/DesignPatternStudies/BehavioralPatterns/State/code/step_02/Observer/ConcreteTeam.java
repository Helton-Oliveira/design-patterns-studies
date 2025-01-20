package com.example.DesignPatternStudies.BehavioralPatterns.State.code.step_02.Observer;

public class ConcreteTeam implements Team {
    private final String TEAM_NAME;

    public ConcreteTeam(String teamName) {
        TEAM_NAME = teamName;
    }

    @Override
    public void update(String message) {
        System.out.println(message);
    }
}
