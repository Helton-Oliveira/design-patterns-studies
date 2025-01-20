package com.example.DesignPatternStudies.BehavioralPatterns.State.code.step_02;

public class Rejected extends AbstractState {
    public Rejected(Project context) {
        super(context);
        this.state = "rejeitado";
    }
}
