package com.example.DesignPatternStudies.BehavioralPatterns.TemplateMethod.code.step_02.TemplateMethod;

public class PixPayment extends Payment {
    private final String PIX_KEY;

    public PixPayment(String pixKey) {
        PIX_KEY = pixKey;
    }

    @Override
    protected void validatePaymentData() {
        var regex = "^[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}$";
        if(!PIX_KEY.matches(regex)) throw new RuntimeException("ERRO! CHAVE PIX NÃO RECONHECIDA OU INVÁLIDA");
        System.out.println("Validando chave pix...");
    }

    @Override
    protected void processPayment() {
        System.out.println("Realizando transferência de valores...");
    }

}
