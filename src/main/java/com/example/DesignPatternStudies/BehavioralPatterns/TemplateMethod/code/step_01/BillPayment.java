package com.example.DesignPatternStudies.BehavioralPatterns.TemplateMethod.code.step_01;

import java.util.List;

public class BillPayment extends Payment {
    private final String TICKET_NUMBER;

    protected BillPayment(List<Product> products, String ticketNumber) {
        super(products);
        TICKET_NUMBER = ticketNumber;
    }

    @Override
    protected void validatePaymentData() {
        String ticketRegex = "^\\d{5}(\\.\\d{5})? \\d{5}(\\.\\d{6})? \\d{5}(\\.\\d{6})? \\d \\d{14}$";
        if(!TICKET_NUMBER.matches(ticketRegex)) throw new RuntimeException("ERRO! NÚMERO DO BOLETO INVÁLIDO");

        System.out.println("Validando boleto...");
    }

    @Override
    protected void processPayment() {
        System.out.println("Esta operação pode levar alguns minutos...");
        System.out.println("Pagamento autorizado...");
    }

    @Override
    protected void generateReceipt() {
        Double total = Double.valueOf(products
                .stream()
                .reduce(0, (subtotal, next) -> (int) (subtotal + next.getPRICE()), Integer::sum));

        Double billGenerationFee = 5.0;
        Double documentValue = total + billGenerationFee;

        System.out.printf("""
                ====== Recibo ======
                Valor da taxa do boleto: %.2f
                Valor total da compra: %.2f
                ====================
                """, billGenerationFee, documentValue);
    }
}
