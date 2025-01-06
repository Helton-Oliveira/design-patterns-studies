package com.example.DesignPatternStudies.BehavioralPatterns.Iterator.code.step_01;

import java.time.LocalDate;
import java.util.List;

public class TaskIterator implements Iterator {
    private Task currentTask;
    private final List<Task> cache;

    public TaskIterator(TaskCollection collection) {
        this.cache = collection.requestFakeToDoList();
        current();
    }

    @Override
    public Task getNext() {
        return cache.stream()
                .filter(t -> currentTask.getTime() >= t.getTime()  && t.getStatus().equalsIgnoreCase("open")
                ).toList().getFirst();
    }

    @Override
    public Task getCurrent() {
        return currentTask;
    }

    @Override
    public Task getPrevious() {
        return cache.stream()
                .filter(t -> t.getTime() < currentTask.getTime() && t.getStatus().equalsIgnoreCase("close") && t.getTerm().equals(currentTask.getTerm()))
                .toList().getFirst();
    }

    private void current() {
        LocalDate today = LocalDate.now();
        for (Task task : cache) {
            if (task.getTerm().equals(today) && task.getStatus().equalsIgnoreCase("open")) {
                if (currentTask == null || task.getTime() < currentTask.getTime()) {
                    currentTask = task;
                }
            }
        }
    }
}
