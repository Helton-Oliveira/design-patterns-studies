package com.example.DesignPatternStudies.behavioralPatterrns;

import com.example.DesignPatternStudies.BehavioralPatterns.Iterator.code.Collection;
import com.example.DesignPatternStudies.BehavioralPatterns.Iterator.code.Iterator;
import com.example.DesignPatternStudies.BehavioralPatterns.Iterator.code.TaskCollection;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IteratorTest {

    @Test
    @DisplayName("Deve iterar sobre o item anterior, atual e o próximo da coleção de tartefas diárias")
    void iteratorTaskCollectionTest() {
        Collection collection = new TaskCollection();
        Iterator iterator = collection.createTaskIterator();

        System.out.println("Esta é a tarefa anterior: " + iterator.getPrevious().getName());
        System.out.println("Esta é a tarefa atual: " + iterator.getCurrent().getName());
        System.out.println("Esta é a próxima tarefa: " + iterator.getNext().getName());
    }
}
