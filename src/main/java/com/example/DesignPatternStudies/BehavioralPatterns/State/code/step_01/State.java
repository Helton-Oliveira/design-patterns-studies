package com.example.DesignPatternStudies.BehavioralPatterns.State.code.step_01;

public interface State {
    void setContext(ProjectContext context);
    void submitted();
    void underEvaluation();
    void approved();
    void rejected();
}
