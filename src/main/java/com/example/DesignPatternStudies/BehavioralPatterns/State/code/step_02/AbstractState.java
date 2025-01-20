package com.example.DesignPatternStudies.BehavioralPatterns.State.code.step_02;

public abstract class AbstractState {
    protected Project context;
    protected String state;

    protected AbstractState(Project context) {
        this.context = context;
    }

    public void submitted() {
        throw new RuntimeException("Impossível submeter projeto, pois se encontra no estado " + state);
    }

    public void underEvaluation() {
        throw new RuntimeException("Impossível avaliar projeto, pois se encontra no estado " + state);
    }

    public void approved() {
        throw new RuntimeException("Impossível aprovar projeto, pois se encontra no estado " + state);
    }

    public void rejected() {
        throw new RuntimeException("Impossível reprovar projeto, pois se encontra no estado " + state);
    }

    public String getState() {
        return state;
    }
}
