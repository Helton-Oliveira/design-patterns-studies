package com.example.DesignPatternStudies.BehavioralPatterns.Strategy.code.step_02.Observer;

public class ConcreteUser implements User{
    private final String name;

    public ConcreteUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(message);
    }

    public String getName() {
        return name;
    }
}
