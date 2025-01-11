package com.example.DesignPatternStudies.BehavioralPatterns.Mediator.code.step_02.iterator;

import com.example.DesignPatternStudies.BehavioralPatterns.Mediator.code.step_02.Spaceship;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSpaceshipCollection implements SpaceshipCollection{
    private final List<Spaceship> collection = new ArrayList<>();

    @Override
    public SpaceshipIterator createSpaceshipIterator() {
        return ConcreteSpaceshipIterator.getInstance (this);
    }

    @Override
    public void addSpaceshipToCollection(Spaceship spaceship) {
        collection.add(spaceship);
    }

    public List<Spaceship> provideCollection() {
        return collection;
    }
}
