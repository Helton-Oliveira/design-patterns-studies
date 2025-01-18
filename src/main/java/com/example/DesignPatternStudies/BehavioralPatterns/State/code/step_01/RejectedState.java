package com.example.DesignPatternStudies.BehavioralPatterns.State.code.step_01;

public class RejectedState implements State {
    private ProjectContext context;

    @Override
    public void setContext(ProjectContext context) {
        this.context = context;
    }

    @Override
    public void submitted() {
        System.out.println("Submissão não é permitida neste estado");
    }

    @Override
    public void underEvaluation() {
        System.out.println("Avaliação não é permitida neste estado.");
    }

    @Override
    public void approved() {
        System.out.println("Projeto já foi rejeitado");
    }

    @Override
    public void rejected() {
        context.setStatus("rejected");
    }
}
