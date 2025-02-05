package com.example.DesignPatternStudies.BehavioralPatterns.Visitor.code.step_02.Visitor;

import java.util.Set;

public class SetStructure<T> implements Element {
    private final Set<T> set;

    public SetStructure(Set<T> set) {
        this.set = set;
    }

    @Override
    public void accept(StructureAnalyzer analyzer) {
        analyzer.toAnalyze(this);
    }

    public Set<T> getSet() {
        return set;
    }

}
