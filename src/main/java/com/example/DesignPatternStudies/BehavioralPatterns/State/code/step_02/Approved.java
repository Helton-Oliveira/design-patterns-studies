package com.example.DesignPatternStudies.BehavioralPatterns.State.code.step_02;

public class Approved extends AbstractState {

    public Approved(Project context) {
        super(context);
        this.state = "aprovado";
    }
}
