package com.example.DesignPatternStudies.BehavioralPatterns.TemplateMethod.code.step_02;

import com.example.DesignPatternStudies.BehavioralPatterns.TemplateMethod.code.step_02.Command.PaymentActionManager;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<Product> products = new ArrayList<>();
    private final PaymentActionManager manager;

    public ShoppingCart(PaymentActionManager manager) {
        this.manager = manager;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public Checkout continueShopping() {
        return new Checkout(manager, products);
    }
}
