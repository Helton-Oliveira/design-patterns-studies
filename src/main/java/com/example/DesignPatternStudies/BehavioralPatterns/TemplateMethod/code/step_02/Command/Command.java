package com.example.DesignPatternStudies.BehavioralPatterns.TemplateMethod.code.step_02.Command;

import com.example.DesignPatternStudies.BehavioralPatterns.TemplateMethod.code.step_02.Checkout;
import com.example.DesignPatternStudies.BehavioralPatterns.TemplateMethod.code.step_02.Product;

import java.util.List;
import java.util.Map;

public abstract class Command {
    protected final Map<String, String> paymentData;
    protected final List<Product> products;
    protected final Checkout checkout;

    protected Command(Map<String, String> paymentData, List<Product> products, Checkout checkout) {
        this.paymentData = paymentData;
        this.products = products;
        this.checkout = checkout;
    }

    public abstract void execute();

    protected final Double calculateTotal() {
        return Double.valueOf(products
                .stream()
                .reduce(0, (subtotal, next) -> (int) (subtotal + next.getPrice()), Integer::sum));
    }
}
