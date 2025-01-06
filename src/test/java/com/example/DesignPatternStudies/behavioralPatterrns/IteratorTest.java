package com.example.DesignPatternStudies.behavioralPatterrns;

import com.example.DesignPatternStudies.BehavioralPatterns.Iterator.code.step_01.Collection;
import com.example.DesignPatternStudies.BehavioralPatterns.Iterator.code.step_01.Iterator;
import com.example.DesignPatternStudies.BehavioralPatterns.Iterator.code.step_01.TaskCollection;
import com.example.DesignPatternStudies.BehavioralPatterns.Iterator.code.step_02.Task02;
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


    @Test
    @DisplayName("Deve iterar sobre o item anterior, atual e o próximo da coleção de tarefas diárias e junto com o padrão chain of responsibility validar tarefas")
    void iteratorTaskCollectionTest_step02() {
        Task02 task = new Task02();
        var search = task.search();

        System.out.println("===== Pending Tasks =====");
        task.displayPendingTasksForTheDay().forEach(t -> System.out.println("Task: " + t.getName()));
        System.out.println("=========================");
        System.out.println("Esta é a tarefa anterior: " + search.getPrevious().getName());
        System.out.println("Esta é a tarefa atual: " + search.getCurrent().getName());
        System.out.println("Esta é a próxima tarefa: " + search.getNext().getName());
    }
}
