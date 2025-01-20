package com.example.DesignPatternStudies.BehavioralPatterns.State.code.step_02.Observer;

public interface ProjectStatusNotifier {
    void subscribe(String teamName, Team team);
    void unsubscribe(String teamName);
    void notifyTeam(String teamName, String message);
}
