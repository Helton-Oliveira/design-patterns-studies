package com.example.DesignPatternStudies.behavioralPatterrns;

import com.example.DesignPatternStudies.BehavioralPatterns.Command.code.Invoker;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CommandTest {

    @Test
    @DisplayName("Deve executar comandos e operações deles")
    void commandPattern() {
        var invoker = new Invoker();
        invoker.executeCommand("additem", "café expresso", 8.0);
        invoker.executeCommand("additem", "torta de frango", 19.0);
        invoker.executeCommand("additem", "sorvete", 12.90);
        invoker.executeCommand("removeItem", "sorvete", 12.90);
        invoker.undo();
        invoker.executeCommand("finalizeOrder", null, null);

    }
}
