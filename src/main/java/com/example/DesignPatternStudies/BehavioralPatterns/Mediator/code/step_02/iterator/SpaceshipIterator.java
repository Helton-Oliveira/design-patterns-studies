package com.example.DesignPatternStudies.BehavioralPatterns.Mediator.code.step_02.iterator;

import com.example.DesignPatternStudies.BehavioralPatterns.Mediator.code.step_02.Spaceship;

public interface SpaceshipIterator {
   Spaceship getNext();
   boolean hasMore();
}
