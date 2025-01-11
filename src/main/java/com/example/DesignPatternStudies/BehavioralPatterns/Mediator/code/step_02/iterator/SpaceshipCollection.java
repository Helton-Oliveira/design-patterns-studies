package com.example.DesignPatternStudies.BehavioralPatterns.Mediator.code.step_02.iterator;

import com.example.DesignPatternStudies.BehavioralPatterns.Mediator.code.step_02.Spaceship;

public interface SpaceshipCollection {
    SpaceshipIterator createSpaceshipIterator();
    void addSpaceshipToCollection(Spaceship spaceship);
}
