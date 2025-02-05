package com.example.DesignPatternStudies.BehavioralPatterns.Visitor.code.step_02.Strategy;

public class DataPurificationContext<T> {
    private DataAnalysisStrategy strategy;

    public void setStrategy(DataAnalysisStrategy strategy) {
        this.strategy = strategy;
    }

    public T executeStrategy() {
        return (T) this.strategy.execute();
    }
}
