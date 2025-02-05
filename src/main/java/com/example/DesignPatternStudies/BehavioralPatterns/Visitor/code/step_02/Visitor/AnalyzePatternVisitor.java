package com.example.DesignPatternStudies.BehavioralPatterns.Visitor.code.step_02.Visitor;

import com.example.DesignPatternStudies.BehavioralPatterns.Visitor.code.step_02.Strategy.DataPurificationContext;
import com.example.DesignPatternStudies.BehavioralPatterns.Visitor.code.step_02.Strategy.IrrelevantDataFilteringList;
import com.example.DesignPatternStudies.BehavioralPatterns.Visitor.code.step_02.Strategy.IrrelevantDataFilteringMap;
import com.example.DesignPatternStudies.BehavioralPatterns.Visitor.code.step_02.Strategy.IrrelevantDataFilteringSet;

import java.util.*;

public class AnalyzePatternVisitor implements StructureAnalyzer {
    private final DataPurificationContext strategy;

    public AnalyzePatternVisitor(DataPurificationContext strategy) {
        this.strategy = strategy;
    }

    @Override
    public void toAnalyze(ListStructure listStructure) {
        strategy.setStrategy(new IrrelevantDataFilteringList<>(listStructure.getList()));
        var structure = (List) strategy.executeStrategy();

        var copyStructure = new ArrayList<>(structure);
        var listSize = structure.size();
        Map<Object, Object> equalItems = new HashMap<>();

        for (int i = 0; i < listSize; i++) {
            var item = copyStructure.removeFirst();
            final int[] totalItems = {0};

            for (Object currentItem : structure)  {
                if(currentItem.equals(item)) {
                    totalItems[0] += 1;
                    equalItems.put(item, totalItems[0]);
                }
            }
        }
        System.out.println("Frequência de cada item no array: " + equalItems);
    }

    @Override
    public void toAnalyze(HashMapStructure hashMapStructure) {
        strategy.setStrategy(new IrrelevantDataFilteringMap(hashMapStructure.getMap()));
        var structure = (Map) strategy.executeStrategy();

        Set<Object> allValues = new HashSet<>(structure.values());
        Map<Object, Integer> result = new HashMap<>();

        for (Object value : structure.values()) {
            if (!allValues.add(value)) {
                result.put(value ,result.getOrDefault(value, 0) + 1);
            }
        }
        System.out.println("Valores e suas frequências no map: " + result);
    }

    @Override
    public void toAnalyze(SetStructure setStructure) {
        strategy.setStrategy(new IrrelevantDataFilteringSet(setStructure.getSet()));
        var structure = (Set) strategy.executeStrategy();

        System.out.println("Estrutura ( SET ) não contém valores repetidos, apenas foram retirados os valores nulos deixando apenas valores válidos para análise: " + structure);
    }

}
