package com.example.DesignPatternStudies.BehavioralPatterns.TemplateMethod.code.step_02.Command;

import java.util.ArrayList;
import java.util.List;

public class PaymentActionManager {
    private Command command;
    private final List<Command> commandHistory = new ArrayList<>();

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
        commandHistory.add(this.command);
    }

    public Command undoCommand() {
        return commandHistory.remove(commandHistory.size() - 2);
    }
}
