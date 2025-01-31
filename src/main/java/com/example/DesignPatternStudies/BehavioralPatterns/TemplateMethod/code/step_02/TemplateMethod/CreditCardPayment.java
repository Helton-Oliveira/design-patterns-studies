package com.example.DesignPatternStudies.BehavioralPatterns.TemplateMethod.code.step_02.TemplateMethod;

public class CreditCardPayment extends Payment {
    private final String CARD_NUMBER;
    private final String SECURITY_CODE;

    public CreditCardPayment(String cardNumber, String securityCode) {
        this.CARD_NUMBER = cardNumber;
        this.SECURITY_CODE = securityCode;
    }

    @Override
    protected void validatePaymentData() {
        if (CARD_NUMBER.length() > 19 && CARD_NUMBER.contains("0")) throw new RuntimeException("ERRO! NUMERO DO CARTÃO DE CRÉDITO INVÁLIDO.");
        if(SECURITY_CODE.length() > 3) throw new RuntimeException("ERRO! CÓDIGO DE SEGURANÇA DO CARTÃO DE CRÉDITO INVÁLIDO.");

        System.out.println("Validando dados do cartão...");
    }

    @Override
    protected void processPayment() {
        System.out.println("Verificando dados com o banco responsável...");
        System.out.println("Verificando crédito disponível para compra...");
        System.out.println("Transferindo valor de crédito para o vendedor...");
    }

}
