package com.example.DesignPatternStudies.BehavioralPatterns.Command.code;

import java.util.HashMap;
import java.util.Map;

public class Invoker {
    private final Map<String ,Command> commandList = new HashMap<>();
    private final Order order = new Order();
    private final CommandHistory history = new CommandHistory();

    private void supportedCommands(String item, Double price) {
        commandList.put("additem", new AddItemToOrderCommand(item, price, order));
        commandList.put("finalizeorder", new FinalizeOrderCommand(order));
        commandList.put("removeitem", new RemoveItemFromOrder(item, order));
        commandList.put("cancelorder", new CancelOrderCommand(order));
    }

    public void executeCommand(String action, String itemName, Double price) {
        supportedCommands(itemName, price);
        if (!commandList.containsKey(action.toLowerCase())) throw new RuntimeException("COMANDO NÃO SUPORTADO");
        Command command = commandList.get(action.toLowerCase());
        history.addCommand(command);
        command.execute();
    }

    public void undo() {
        var command = history.popCommand();
        if(command != null) {
            command.execute();
        }
    }
}
