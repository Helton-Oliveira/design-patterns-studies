package com.example.DesignPatternStudies.BehavioralPatterns.Visitor.code.step_01;

import java.util.*;

public class ConcreteStructureAnalyzer implements StructureAnalyzer {

    @Override
    public void toAnalyze(ListStructure listStructure) {
        var structure = listStructure.getList();
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
        System.out.println(equalItems);
    }

    @Override
    public void toAnalyze(HashMapStructure hashMapStructure) {
        Map<Object, Object> result = new HashMap<>();
        var structure = hashMapStructure.getMap();

        for (Object key : structure.keySet()) {
            if(structure.get(key) == null) result.put(key, " Contém valor nulo!");
        }
        System.out.println(result);
    }

    @Override
    public void toAnalyze(SetStructure setStructure) {
        var structure = setStructure.getSet();
        if(structure.size() > setStructure.getAmountOfDataRequired()) System.out.println("Quantidade de dados excede o necessário");
    }
}
