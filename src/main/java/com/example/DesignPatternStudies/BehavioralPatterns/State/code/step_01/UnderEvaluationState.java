package com.example.DesignPatternStudies.BehavioralPatterns.State.code.step_01;

public class UnderEvaluationState implements State {
    private  ProjectContext context;

    @Override
    public void setContext(ProjectContext context) {
        this.context = context;
    }

    @Override
    public void submitted() {
        System.out.println("Envio do projeto não é permitida neste estado.");
    }

    @Override
    public void underEvaluation() {
        System.out.println("Projeto em avaliação");
    }

    @Override
    public void approved() {
        System.out.println("Parabéns " + context.getTeamName() + " o seu projeto " + context.getProjectName() + " foi aprovado.");
        var state = new ApprovedState();
        state.setContext(context);
        context.changeState(state);
    }

    @Override
    public void rejected() {
        System.out.println("Infelizmente seu projeto " + context.getProjectName() + " foi rejeitado.");
        var state = new RejectedState();
        state.setContext(context);
        context.changeState(state);
    }
}
