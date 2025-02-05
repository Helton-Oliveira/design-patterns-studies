package com.example.DesignPatternStudies.BehavioralPatterns.Visitor.code.step_02.Strategy;

import java.util.Objects;
import java.util.Set;

public class IrrelevantDataFilteringSet<T> implements DataAnalysisStrategy {
    private final Set<T> set;

    public IrrelevantDataFilteringSet(Set<T> set) {
        this.set = set;
    }

    @Override
    public T execute() {
        set.removeIf(Objects::isNull);
        return (T) set;
    }
}
