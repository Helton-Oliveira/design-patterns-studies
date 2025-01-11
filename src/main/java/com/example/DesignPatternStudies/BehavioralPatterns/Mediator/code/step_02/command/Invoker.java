package com.example.DesignPatternStudies.BehavioralPatterns.Mediator.code.step_02.command;

public interface Invoker {
    void setCommand(Command command);
    int executeCommand();
}
