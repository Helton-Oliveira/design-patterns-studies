package com.example.DesignPatternStudies.BehavioralPatterns.State.code.step_01;

public class ProjectContext {
    private final String projectName;
    private final String teamName;
    private String status;
    private State state;

    public ProjectContext(String projectName, String teamName) {
        this.projectName = projectName;
        this.teamName = teamName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void submitted() {
        state.submitted();
    }

    public void underEvaluation() {
        state.underEvaluation();
    }

    public void approved() {
        state.approved();
    }

    public void rejected() {
        state.rejected();
    }

    public void changeState(State state) {
        this.state = state;
        state.setContext(this);
    }

    public String getProjectName() {
        return projectName;
    }

    public String getTeamName() {
        return teamName;
    }
}
