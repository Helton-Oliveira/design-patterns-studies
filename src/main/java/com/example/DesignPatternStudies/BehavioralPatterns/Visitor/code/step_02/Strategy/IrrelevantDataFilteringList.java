package com.example.DesignPatternStudies.BehavioralPatterns.Visitor.code.step_02.Strategy;

import java.util.List;
import java.util.Objects;

public class IrrelevantDataFilteringList<T> implements DataAnalysisStrategy {
    private final List<T> list;

    public IrrelevantDataFilteringList(List<T> listStructure) {
        this.list = listStructure;
    }

    @Override
    public T execute() {
         list.removeIf(Objects::isNull);
         return (T) list;
    }
}
