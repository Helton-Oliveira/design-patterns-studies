package com.example.DesignPatternStudies.BehavioralPatterns.Iterator.code.step_02.IteratorBlock;

import com.example.DesignPatternStudies.BehavioralPatterns.Iterator.code.step_02.Task02;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TaskCollection02 implements Collection02 {
    private final List<Task02> taskList = new ArrayList<>();

    public TaskCollection02() {
        requestFakeToDoList();
    }

    @Override
    public Iterator02 createIterator() {
        return new TaskIterator02(this);
    }

   public List<Task02> organizedList() {
        return taskList.stream()
                .sorted(Comparator.comparing(Task02::getTerm)
                .thenComparing(Task02::getTime))
                        .collect(Collectors.toList());
   }

    private void requestFakeToDoList() {
        taskList.add(Task02.create("academia", LocalDate.parse("2025-01-06"),14));
        taskList.add(Task02.create("estudar", LocalDate.parse("2025-01-06"),20));
        taskList.add(Task02.create("leitura", LocalDate.parse("2025-01-06"),9));
        taskList.add(Task02.create("ir ao mercado", LocalDate.parse("2025-01-07"),10));
        taskList.add(Task02.create("reunião", LocalDate.parse("2025-01-06"),11));

        var taskClosed = Task02.create("jogar", LocalDate.parse("2025-01-03"),23);
        taskClosed.setStatus("close");

        taskList.add(taskClosed);

    }
}
