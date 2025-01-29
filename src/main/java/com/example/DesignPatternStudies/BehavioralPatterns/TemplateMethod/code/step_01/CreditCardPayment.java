package com.example.DesignPatternStudies.BehavioralPatterns.TemplateMethod.code.step_01;

import java.util.List;

public class CreditCardPayment extends Payment{
    private final String CARD_NUMBER;
    private final String SECURITY_CODE;
    private final Integer INSTALLMENTS;

    protected CreditCardPayment(List<Product> products, String cardNumber, String securityCode, Integer installments) {
        super(products);
        this.CARD_NUMBER = cardNumber;
        this.SECURITY_CODE = securityCode;
        this.INSTALLMENTS = installments;
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

    @Override
    protected void generateReceipt() {
        Double total = Double.valueOf(products
                .stream()
                .reduce(0, (subtotal, next) -> (int) (subtotal + next.getPRICE()), Integer::sum));

        Double totalInstallment = total / INSTALLMENTS;

        System.out.printf(
                """
                ===== Recibo Da compra =====
                Valor total da compra: %.2f
                Valor total de cada parcela: %.2f
                ============================
                """, total, totalInstallment);
    }
}
