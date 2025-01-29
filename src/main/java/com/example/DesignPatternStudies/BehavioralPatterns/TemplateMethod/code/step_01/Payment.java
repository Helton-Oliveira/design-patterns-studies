package com.example.DesignPatternStudies.BehavioralPatterns.TemplateMethod.code.step_01;

import java.util.List;
import java.util.UUID;

public abstract class Payment {
    protected final List<Product> products;

    protected Payment(List<Product> products) {
        this.products = products;
    }

    public void pay() {
        validatePaymentData();
        processPayment();
        confirmPayment();
        generateOrder();
        generateReceipt();
        sendReceipt();
    }

    private void generateOrder() {
        System.out.println("pedido " + UUID.randomUUID() + " gerado com sucesso!");
    }

    private void sendReceipt() {
        System.out.println("enviando pedido ao usuário..." + "\n");
    }

    protected void confirmPayment(){
        System.out.println("Compra confirmada com sucesso!");
    }

    protected abstract void validatePaymentData();

    protected abstract void processPayment();

    protected abstract void generateReceipt();

}
