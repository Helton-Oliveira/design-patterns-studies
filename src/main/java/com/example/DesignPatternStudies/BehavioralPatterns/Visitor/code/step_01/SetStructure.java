package com.example.DesignPatternStudies.BehavioralPatterns.Visitor.code.step_01;

import java.util.Set;

public class SetStructure<T> implements Element {
    private final Set<T> set;
    private final Integer amountOfDataRequired;

    public SetStructure(Set<T> set, Integer amountOfDataRequired) {
        this.set = set;
        this.amountOfDataRequired = amountOfDataRequired;
    }

    @Override
    public void accept(StructureAnalyzer analyzer) {
        analyzer.toAnalyze(this);
    }

    public Set<T> getSet() {
        return set;
    }

    public Integer getAmountOfDataRequired() {
        return amountOfDataRequired;
    }
}
