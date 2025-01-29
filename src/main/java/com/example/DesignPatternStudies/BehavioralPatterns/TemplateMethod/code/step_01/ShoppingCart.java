package com.example.DesignPatternStudies.BehavioralPatterns.TemplateMethod.code.step_01;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private Payment payment;
    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void pay(String cardNumber, String securityCode, Integer installments) {
        payment = new CreditCardPayment(this.products, cardNumber, securityCode, installments);
    }

    public void pay(String method, String key) {
        if(method.equalsIgnoreCase("bankSlip")) payment = new BillPayment(this.products, key);
        if(method.equalsIgnoreCase("pix")) payment = new PixPayment(this.products, key);
    }

    public void confirmOrder() {
        payment.pay();
    }
}
