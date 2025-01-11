package com.example.DesignPatternStudies.BehavioralPatterns.Mediator.code.step_02.iterator;

import com.example.DesignPatternStudies.BehavioralPatterns.Mediator.code.step_02.Spaceship;

import java.util.List;

public class ConcreteSpaceshipIterator implements SpaceshipIterator {
    private final ConcreteSpaceshipCollection collection;
    private List<Spaceship> cache;
    private Integer currentIndex = 0;
    private static ConcreteSpaceshipIterator instance;

    private ConcreteSpaceshipIterator(ConcreteSpaceshipCollection collection) {
        this.collection = collection;
    }

    public static ConcreteSpaceshipIterator getInstance(ConcreteSpaceshipCollection collection) {
        if ( instance == null) {
            instance = new ConcreteSpaceshipIterator(collection);
        }
        return instance;
    }

    private void lazyInit() {
        this.cache = collection.provideCollection();
    }

    @Override
    public Spaceship getNext() {
        if (!hasMore()) {
           return null;
        }
        var result = cache.get(currentIndex);
        currentIndex += 1;
        return result;
    }

    @Override
    public boolean hasMore() {
        lazyInit();
        return currentIndex < cache.size();
    }
}
