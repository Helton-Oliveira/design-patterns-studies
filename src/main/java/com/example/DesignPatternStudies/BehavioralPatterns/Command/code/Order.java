package com.example.DesignPatternStudies.BehavioralPatterns.Command.code;

import java.util.HashMap;
import java.util.Map;

public class Order {
    private final Map<String, Double> items = new HashMap<>();
    private Double total = 0.0;

    public void addItemToOrder(String item, Double price) {
        items.put(item, price);
    }

    public Double calculateOrderPrice() {
        items.forEach((key, value) -> {
            total += value;
        });
        return total;
    }

    public void removeItem(String item) {
        items.remove(item);
    }

    public void cancel() {
        items.forEach(items::remove);
        System.out.println("Pedido cancelado com sucesso!");
    }

}
