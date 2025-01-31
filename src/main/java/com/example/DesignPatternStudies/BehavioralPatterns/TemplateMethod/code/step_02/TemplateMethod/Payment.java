package com.example.DesignPatternStudies.BehavioralPatterns.TemplateMethod.code.step_02.TemplateMethod;

import java.util.UUID;

public abstract class Payment {
    protected Double TOTAL_TO_PAY;

    public final void pay() {
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

    protected void generateReceipt() {
        System.out.println("gerando recibo...");
    }

    protected abstract void validatePaymentData();

    protected abstract void processPayment();

    protected void setTOTAL_TO_PAY(Double total) {
        TOTAL_TO_PAY = total;
    }

}
