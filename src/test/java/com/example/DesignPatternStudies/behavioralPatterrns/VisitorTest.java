package com.example.DesignPatternStudies.behavioralPatterrns;

import com.example.DesignPatternStudies.BehavioralPatterns.Visitor.code.step_02.Strategy.*;
import com.example.DesignPatternStudies.BehavioralPatterns.Visitor.code.step_02.Visitor.AnalyzePatternVisitor;
import com.example.DesignPatternStudies.BehavioralPatterns.Visitor.code.step_02.Visitor.HashMapStructure;
import com.example.DesignPatternStudies.BehavioralPatterns.Visitor.code.step_02.Visitor.ListStructure;
import com.example.DesignPatternStudies.BehavioralPatterns.Visitor.code.step_02.Visitor.SetStructure;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

public class VisitorTest {

    /*@Test
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
    }*/

    @Test
    @DisplayName("Deve analisar as diferentes estruturas de dados junto com a estratégia de limpeza")
    void visitorTestStep_01() {
        // Strategy
        var strategy = new DataPurificationContext<>();

        // List Structure
        List<String> stringList = new ArrayList<>(Arrays.asList("A", "B", "A", "C", "B", "A", null, null));
        List<Integer> integerList = new ArrayList<>(Arrays.asList(4, 10, 10, 3, 2, 7, 7, 4, 4, 4));

        var analyzer = new AnalyzePatternVisitor(strategy);
        var stringListStructure = new ListStructure<>(stringList);
        var integerListStructure = new ListStructure<>(integerList);
        stringListStructure.accept(analyzer);
        integerListStructure.accept(analyzer);

        // Map Structure
        Map<String, String> stringMap = new HashMap<>(Map.of(
                "user1", "admin",
                "user2", "admin",
                "user3","guest"));
        stringMap.put("user4", null);

        var mapStructureAnalyzer = new HashMapStructure<>(stringMap);
        mapStructureAnalyzer.accept(analyzer);

        // Set Structure
        Set<String> stringSet = new HashSet<>(Set.of(
                "id", "name", "email", "address", "phone",
                "internal_code", "timestamp_creation",
                "flag_test", "version_schema"
        ));

        stringSet.add(null);
        stringSet.add(null);
        stringSet.add(null);

        var setStructureAnalyzer = new SetStructure<>(stringSet);
        setStructureAnalyzer.accept(analyzer);
    }
}
