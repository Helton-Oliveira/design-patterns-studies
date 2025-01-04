package com.example.DesignPatternStudies.BehavioralPatterns.Iterator.code;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskCollection implements Collection {
    private final List<Task> taskList = new ArrayList<>();

    @Override
    public Iterator createTaskIterator() {
        return new TaskIterator(this);
    }

    public List<Task> requestFakeToDoList() {
        taskList.add(new Task("academia", LocalDate.parse("2025-01-04"), "open", 14));
        taskList.add(new Task("estudar", LocalDate.parse("2025-01-03"), "open", 20));
        taskList.add(new Task("leitura", LocalDate.parse("2025-01-03"), "close", 9));
        taskList.add(new Task("ir ao mercado", LocalDate.parse("2025-01-07"), "open", 10));
        taskList.add(new Task("reunião", LocalDate.parse("2025-01-04"), "open", 11));
        taskList.add(new Task("jogar", LocalDate.parse("2025-01-03"), "open", 23));

        return taskList;
    }
}
