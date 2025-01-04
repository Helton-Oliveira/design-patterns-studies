package com.example.DesignPatternStudies.BehavioralPatterns.Iterator.code;

public interface Iterator {
    Task getNext();
    Task getCurrent();
    Task getPrevious();
}
