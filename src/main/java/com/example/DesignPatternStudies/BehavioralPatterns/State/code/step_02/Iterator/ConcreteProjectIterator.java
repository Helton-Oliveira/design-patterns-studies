package com.example.DesignPatternStudies.BehavioralPatterns.State.code.step_02.Iterator;

import com.example.DesignPatternStudies.BehavioralPatterns.State.code.step_02.Project;

import java.util.List;

public class ConcreteProjectIterator implements ProjectIterator {
    private final List<Project> cache;
    private int currentIndex;

    public   ConcreteProjectIterator(ConcreteCollectionProject collection) {
        this.cache = collection.getProject();
        currentIndex = 0;
    }

    @Override
    public Project getNext() {
        if (hasMore()) {
            var project = cache.get(currentIndex);
            currentIndex++;
            return project;
        }
        throw new RuntimeException("Todos os projetos foram corrigidos");
    }

    @Override
    public boolean hasMore() {
        return cache.size() > currentIndex;
    }
}
