package com.example.DesignPatternStudies.BehavioralPatterns.State.code.step_02.Iterator;

import com.example.DesignPatternStudies.BehavioralPatterns.State.code.step_02.Project;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCollectionProject implements ProjectCollection {
    private final List<Project> projectList = new ArrayList<>();

    @Override
    public ProjectIterator createIterator() {
        return new ConcreteProjectIterator(this);
    }

    @Override
    public void addProjectToCollection(Project project) {
        projectList.add(project);
    }

    public List<Project> getProject() {
        return this.projectList;
    }
}
