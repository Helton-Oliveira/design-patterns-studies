package com.example.DesignPatternStudies.BehavioralPatterns.Strategy.code.step_02.Observer;

import java.util.HashMap;
import java.util.Map;

public class EventManager {
    private final Map<String, User> userMap = new HashMap<>();

    public void subscribe(String name, User user) {
        userMap.put(name, user);
    }

    public void unSubscribe(String name, User user) {
        userMap.remove(name, user);
    }

    public void notifySubscribe(String name, String message) {
        userMap.get(name).update(message);
    }
}
