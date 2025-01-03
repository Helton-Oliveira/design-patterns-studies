package com.example.DesignPatternStudies.BehavioralPatterns.Command.code;

public class AddItemToOrderCommand implements Command {
    private final String itemName;
    private final Double itemPrice;
    private final Order order;

    public AddItemToOrderCommand(String itemName, Double itemPrice, Order order) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.order = order;
    }

    @Override
    public void execute() {
        order.addItemToOrder(itemName, itemPrice);
        System.out.println(itemName + " Adicionado!");
    }
}
