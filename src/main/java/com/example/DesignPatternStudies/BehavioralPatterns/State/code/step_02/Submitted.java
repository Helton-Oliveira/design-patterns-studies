package com.example.DesignPatternStudies.BehavioralPatterns.State.code.step_02;


import com.example.DesignPatternStudies.BehavioralPatterns.State.code.step_02.Iterator.ProjectIterator;

public class Submitted extends AbstractState {
    private final ProjectIterator iterator;

    protected Submitted(Project context, ProjectIterator iterator) {
        super(context);
        this.iterator = iterator;
        this.state = "submetido";
    }

    @Override
    public void underEvaluation() {
        this.context = iterator.getNext();
        context.changeState(new UnderEvaluation(context));
    }
}
