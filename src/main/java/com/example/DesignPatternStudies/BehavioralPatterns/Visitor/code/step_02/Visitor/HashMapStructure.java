package com.example.DesignPatternStudies.BehavioralPatterns.Visitor.code.step_02.Visitor;

import java.util.Map;

public class HashMapStructure<K,V> implements Element {
    private final Map<K,V> map;

    public HashMapStructure(Map<K, V> map) {
        this.map = map;
    }

    @Override
    public void accept(StructureAnalyzer analyzer) {
        analyzer.toAnalyze(this);
    }

    public Map<K, V> getMap() {
        return map;
    }


}
