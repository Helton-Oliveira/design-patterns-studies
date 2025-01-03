package com.example.DesignPatternStudies.BehavioralPatterns.Command.code;

public class RemoveItemFromOrder implements Command{
    private final Order order;
    private final String item;

    public RemoveItemFromOrder(String item, Order order) {
        this.item = item;
        this.order = order;
    }

    @Override
    public void execute() {
        order.removeItem(item);
        System.out.println(item + " removido do pedido" );
    }
}
