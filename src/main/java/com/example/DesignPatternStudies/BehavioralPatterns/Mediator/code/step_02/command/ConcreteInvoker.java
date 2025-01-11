package com.example.DesignPatternStudies.BehavioralPatterns.Mediator.code.step_02.command;

public class ConcreteInvoker implements Invoker{
    private Command command;

    @Override
    public void setCommand(Command command) {
        this.command = command;
    }

    @Override
    public int executeCommand() {
        return command.execute();
    }
}
