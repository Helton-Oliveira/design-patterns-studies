package com.example.DesignPatternStudies.BehavioralPatterns.Command.code;

import java.util.ArrayList;
import java.util.List;

public class CommandHistory {
    private final List<Command> commandList = new ArrayList<>();

    public void addCommand(Command command) {
        commandList.add(command);
    }

    public Command popCommand() {
        commandList.removeLast();
        return commandList.getLast();
    }
}
