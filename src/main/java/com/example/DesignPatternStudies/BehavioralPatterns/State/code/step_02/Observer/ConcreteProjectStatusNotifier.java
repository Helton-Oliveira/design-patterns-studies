package com.example.DesignPatternStudies.BehavioralPatterns.State.code.step_02.Observer;

import java.util.HashMap;
import java.util.Map;

public class ConcreteProjectStatusNotifier implements ProjectStatusNotifier {
    private final Map<String, Team> teamList = new HashMap<>();

    @Override
    public void subscribe(String teamName, Team team) {
        teamList.put(teamName, team);
    }

    @Override
    public void unsubscribe(String teamName) {
        teamList.remove(teamName);
    }

    @Override
    public void notifyTeam(String teamName, String message) {
        teamList.get(teamName).update(message);
    }
}
