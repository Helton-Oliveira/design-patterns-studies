package com.example.DesignPatternStudies.BehavioralPatterns.Iterator.code.step_02.IteratorBlock;

import com.example.DesignPatternStudies.BehavioralPatterns.Iterator.code.step_02.Task02;

import java.time.LocalDate;
import java.util.List;

public class TaskIterator02 implements Iterator02 {
    private final List<Task02> cache;
    private final Task02 current;
    private int currentIndex;

    public TaskIterator02(TaskCollection02 collection) {
        cache = collection.organizedList();
        current = cache.stream()
                .filter(t -> t.getStatus().equalsIgnoreCase("open"))
                .toList().getFirst();
        getCurrentIndex();
    }

    @Override
    public Task02 getPrevious() {
        return cache.get(currentIndex - 1);
    }

    @Override
    public Task02 getCurrent() {
        return current;
    }

    @Override
    public Task02 getNext() {
        return cache.get(currentIndex + 1);
    }

    @Override
    public List<Task02> displayPendingTasks() {
        return cache.stream()
                .filter(t -> t.getTerm().isEqual(LocalDate.now()) || t.getTerm().isBefore(LocalDate.now()) && t.getStatus().equalsIgnoreCase("open"))
                .toList();
    }

    private void getCurrentIndex() {
        for(int i = 0; i <= cache.size(); i++) {
            if (current.getName().equalsIgnoreCase(cache.get(i).getName())) {
                currentIndex = i;
                break;
            }
        }
    }
}
