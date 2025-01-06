package com.example.DesignPatternStudies.BehavioralPatterns.Iterator.code.step_02.IteratorBlock;

import com.example.DesignPatternStudies.BehavioralPatterns.Iterator.code.step_02.Task02;

import java.util.List;

public interface Iterator02 {
    Task02 getPrevious();
    Task02 getCurrent();
    Task02 getNext();
    List<Task02> displayPendingTasks();
}
