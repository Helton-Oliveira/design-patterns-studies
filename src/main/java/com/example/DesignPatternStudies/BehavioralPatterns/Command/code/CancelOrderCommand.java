package com.example.DesignPatternStudies.BehavioralPatterns.Command.code;

public class CancelOrderCommand implements Command {
    private final Order order;

    public CancelOrderCommand(Order order) {
        this.order = order;
    }

    @Override
    public void execute() {
        order.cancel();
    }
}
