package com.example.DesignPatternStudies.BehavioralPatterns.Visitor.code.step_01;

import java.util.List;

public class ListStructure<T> implements Element {
    private List<T> list;

    public ListStructure(List<T> list) {
        this.list = list;
    }

    @Override
    public void accept(StructureAnalyzer analyzer) {
        analyzer.toAnalyze(this);
    }

    public List<T> getList() {
        return list;
    }
}
