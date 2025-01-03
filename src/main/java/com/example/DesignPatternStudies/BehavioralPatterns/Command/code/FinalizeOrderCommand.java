package com.example.DesignPatternStudies.BehavioralPatterns.Command.code;

public class FinalizeOrderCommand implements Command {
    private final Order order;

    public FinalizeOrderCommand(Order order) {
        this.order = order;
    }

    @Override
    public void execute() {
        var result = order.calculateOrderPrice();
        System.out.println("Aqui está o resultado do pedido: R$" + Math.round(result));
    }
}
