package com.example.DesignPatternStudies.BehavioralPatterns.State.code.step_01;

public class ApprovedState implements State {
    private ProjectContext context;

    @Override
    public void submitted() {
        System.out.println("Submissão não é permitido neste estado");
    }

    @Override
    public void underEvaluation() {
        System.out.println("Avaliação não é permitido neste estado");
    }

    @Override
    public void approved() {
        context.setStatus("approved");
    }

    @Override
    public void rejected() {
        System.out.println("Rejeição não é permitido neste estado");
    }

    @Override
    public void setContext(ProjectContext context) {
        this.context = context;
    }
}
