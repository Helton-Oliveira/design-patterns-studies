package com.example.DesignPatternStudies.BehavioralPatterns.Iterator.code.step_01;

import java.time.LocalDate;

public class Task {
    private final String name;
    private final LocalDate term;
    private final String status;
    private final Integer time;

    public Task(String name, LocalDate term, String status, Integer time) {
        this.name = name;
        this.term = term;
        this.status = status;
        this.time = time;
    }

    public Integer getTime() {
        return time;
    }

    public String getName() {
        return name;
    }

    public LocalDate getTerm() {
        return term;
    }

    public String getStatus() {
        return status;
    }
}
