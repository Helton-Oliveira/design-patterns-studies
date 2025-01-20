package com.example.DesignPatternStudies.BehavioralPatterns.State.code.step_02;

public class UnderEvaluation extends AbstractState {

    public UnderEvaluation(Project context) {
        super(context);
        this.state = "em avaliação";
    }

    @Override
    public void approved() {
        context.changeState(new Approved(context));
    }

    @Override
    public void rejected() {
        context.changeState(new Rejected(context));
    }
}
