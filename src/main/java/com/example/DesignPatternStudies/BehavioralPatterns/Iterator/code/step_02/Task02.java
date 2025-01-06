package com.example.DesignPatternStudies.BehavioralPatterns.Iterator.code.step_02;

import com.example.DesignPatternStudies.BehavioralPatterns.Iterator.code.step_02.ChainOfResposibilityBlock.BaseValidator;
import com.example.DesignPatternStudies.BehavioralPatterns.Iterator.code.step_02.ChainOfResposibilityBlock.ValidateDateOfDay;
import com.example.DesignPatternStudies.BehavioralPatterns.Iterator.code.step_02.ChainOfResposibilityBlock.ValidateTaskStatus;
import com.example.DesignPatternStudies.BehavioralPatterns.Iterator.code.step_02.ChainOfResposibilityBlock.Validator;
import com.example.DesignPatternStudies.BehavioralPatterns.Iterator.code.step_02.IteratorBlock.Collection02;
import com.example.DesignPatternStudies.BehavioralPatterns.Iterator.code.step_02.IteratorBlock.Iterator02;
import com.example.DesignPatternStudies.BehavioralPatterns.Iterator.code.step_02.IteratorBlock.TaskCollection02;

import java.time.LocalDate;
import java.util.List;

public class Task02 {
    private String name;
    private LocalDate term;
    private String status;
    private Integer time;

    public Task02(){}

    private Task02(String name, LocalDate term, Integer time) {
        this.name = name;
        this.term = term;
        this.time = time;
        this.status = "open";
    }

    public static Task02 create(String name, LocalDate term, Integer time) {
        return new Task02(name, term, time);
    }

    public void completeTask() {
        if (status.equalsIgnoreCase("open")) {
            this.status = "close";
        }
    }

    public Iterator02 search() {
        Collection02 collection = new TaskCollection02();
        return collection.createIterator();
    }

    public List<Task02> displayPendingTasksForTheDay() {
        var pendingTasks = search().displayPendingTasks();
        var baseValidator = new BaseValidator();
        var dateValidator = new ValidateDateOfDay();
        var statusValidator = new ValidateTaskStatus();

        baseValidator
                .setNext(dateValidator)
                .setNext(statusValidator);

        pendingTasks.forEach(baseValidator::valid);

        return pendingTasks;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public Integer getTime() {
        return time;
    }


}
