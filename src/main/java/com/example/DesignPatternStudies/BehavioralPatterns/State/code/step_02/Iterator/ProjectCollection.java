package com.example.DesignPatternStudies.BehavioralPatterns.State.code.step_02.Iterator;

import com.example.DesignPatternStudies.BehavioralPatterns.State.code.step_02.Project;

public interface ProjectCollection {
    ProjectIterator createIterator();
    void addProjectToCollection(Project project);
}
