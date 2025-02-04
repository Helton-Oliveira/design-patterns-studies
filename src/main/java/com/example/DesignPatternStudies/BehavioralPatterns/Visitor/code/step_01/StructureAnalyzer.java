package com.example.DesignPatternStudies.BehavioralPatterns.Visitor.code.step_01;

public interface StructureAnalyzer {
    void toAnalyze(ListStructure listStructure);
    void toAnalyze(HashMapStructure hashMapStructure);
    void toAnalyze(SetStructure setStructure);
}
