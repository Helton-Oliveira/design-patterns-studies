package com.example.DesignPatternStudies.BehavioralPatterns.State.code.step_02;

import com.example.DesignPatternStudies.BehavioralPatterns.State.code.step_02.Iterator.ProjectCollection;
import com.example.DesignPatternStudies.BehavioralPatterns.State.code.step_02.Iterator.ProjectIterator;
import com.example.DesignPatternStudies.BehavioralPatterns.State.code.step_02.Observer.ProjectStatusNotifier;

public class Project {
    private final ProjectStatusNotifier statusNotifier;
    private final ProjectCollection COLLECTION;
    private final ProjectIterator ITERATOR;
    private final String projectName;
    private final String teamName;
    public AbstractState abstractState;

    public Project(ProjectStatusNotifier statusNotifier, ProjectCollection projectCollection, ProjectIterator iterator, String projectName, String teamName) {
        this.statusNotifier = statusNotifier;
        this.COLLECTION = projectCollection;
        ITERATOR = iterator;
        this.projectName = projectName;
        this.teamName = teamName;
    }

    public void changeState(AbstractState state) {
        this.abstractState = state;
        statusNotifier.notifyTeam(this.teamName, " Houve uma alteração no estado do seu projeto " + this.projectName + ", agora ele está " + state.getState());
    }

    public void submitted() {
        COLLECTION.addProjectToCollection(this);
        changeState(new Submitted(this, ITERATOR));
    }

    public void underEvaluation() {
        abstractState.underEvaluation();
    }

    public void approved() {
        abstractState.approved();
    }

    public void rejected() {
        abstractState.rejected();
    }

    public String getTeamName() {
        return teamName;
    }
}
