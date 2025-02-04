package com.example.DesignPatternStudies.behavioralPatterrns;

import com.example.DesignPatternStudies.BehavioralPatterns.Visitor.code.step_01.ConcreteStructureAnalyzer;
import com.example.DesignPatternStudies.BehavioralPatterns.Visitor.code.step_01.HashMapStructure;
import com.example.DesignPatternStudies.BehavioralPatterns.Visitor.code.step_01.ListStructure;
import com.example.DesignPatternStudies.BehavioralPatterns.Visitor.code.step_01.SetStructure;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

public class VisitorTest {

    @Test
    @DisplayName("Deve analisar as diferentes estruturas de dados")
    void visitorTestStep_01() {
        // List Structure
        List<String> stringList = new ArrayList<>(Arrays.asList("A", "B", "A", "C", "B", "A", "D"));
        List<Integer> integerList = new ArrayList<>(Arrays.asList(4, 10, 10, 3, 2, 7, 7, 4, 4, 4));

        var analyzer = new ConcreteStructureAnalyzer();
        var stringListStructure = new ListStructure<>(stringList);
        var integerListStructure = new ListStructure<>(integerList);
        stringListStructure.accept(analyzer);
        integerListStructure.accept(analyzer);

        // Map Structure
        Map<String, String> stringMap = new HashMap<>(Map.of(
                "user1", "admin",
                "user2", "presenter",
                "user3","guest"));
        stringMap.put("user4", null);

        var mapStructureAnalyzer = new HashMapStructure<>(stringMap);
        mapStructureAnalyzer.accept(analyzer);

        // Set Structure
        Set<String> stringSet = new HashSet<>(Set.of(
                "id", "name", "email", "age", "address", "phone",
                "internal_code", "timestamp_creation", "last_update",
                "flag_test", "comments", "version_schema"
        ));

        var setStructureAnalyzer = new SetStructure<>(stringSet, 6);
        setStructureAnalyzer.accept(analyzer);
    }
}
