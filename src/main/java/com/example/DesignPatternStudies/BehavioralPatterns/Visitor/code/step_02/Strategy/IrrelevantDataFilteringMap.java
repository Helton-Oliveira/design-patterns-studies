package com.example.DesignPatternStudies.BehavioralPatterns.Visitor.code.step_02.Strategy;

import java.util.Map;

public class IrrelevantDataFilteringMap<T, K, V> implements DataAnalysisStrategy {
    private final Map<K, V> map;

    public IrrelevantDataFilteringMap(Map<K, V> map) {
        this.map = map;
    }

    @Override
    public T execute() {
        for (Object key : map.keySet()) {
            if (key == null || map.get(key) == null) {
                map.remove(key);
            }
        }
        return (T) map;
    }
}
