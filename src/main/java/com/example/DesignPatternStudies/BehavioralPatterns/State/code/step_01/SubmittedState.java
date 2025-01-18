package com.example.DesignPatternStudies.BehavioralPatterns.State.code.step_01;

public class SubmittedState implements State {
    private  ProjectContext context;

    @Override
    public void setContext(ProjectContext context) {
        this.context = context;
    }

    @Override
    public void submitted() {
        System.out.println("Projeto enviado. Aguardando para entrar em avaliação");
    }

    @Override
    public void underEvaluation() {
        System.out.println("Projeto agora em avaliação.");
        var state = new UnderEvaluationState();
        state.setContext(context);
        context.changeState(state);
    }

    @Override
    public void approved() {
        System.out.println("Aprovação não é permitida neste estado");
    }

    @Override
    public void rejected() {
        System.out.println("Rejeição não é permitida neste estado");
    }
}
