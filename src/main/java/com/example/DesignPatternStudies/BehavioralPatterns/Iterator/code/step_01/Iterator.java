package com.example.DesignPatternStudies.BehavioralPatterns.Iterator.code.step_01;

public interface Iterator {
    Task getNext();
    Task getCurrent();
    Task getPrevious();
}
