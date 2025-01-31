package com.example.DesignPatternStudies.BehavioralPatterns.TemplateMethod.code.step_02;

import com.example.DesignPatternStudies.BehavioralPatterns.TemplateMethod.code.step_02.Command.*;
import com.example.DesignPatternStudies.BehavioralPatterns.TemplateMethod.code.step_02.TemplateMethod.Payment;

import java.util.List;
import java.util.Map;

public class Checkout {
    private Payment payment;
    private final PaymentActionManager paymentActionManager;
    private final List<Product> products;

    public Checkout(PaymentActionManager paymentActionManager, List<Product> products) {
        this.paymentActionManager = paymentActionManager;
        this.products = products;
    }

    public void insertPaymentData(Map<String, String> paymentData) {
        if(paymentData.containsKey("creditCard")) paymentActionManager.setCommand(new CreditCardCommand(paymentData, products, this));
        if(paymentData.containsKey("bankSlip")) paymentActionManager.setCommand(new BankSlipCommand(paymentData, products, this));
        if(paymentData.containsKey("pixKey")) paymentActionManager.setCommand(new PixCommand(paymentData, products, this));

        paymentActionManager.executeCommand();
    }

    public void pay() {
        payment.pay();
    }

    public void revertPayment() {
        System.out.println("Pagamento alterado para o anterior...");
        paymentActionManager.
                undoCommand()
                .execute();
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

}
