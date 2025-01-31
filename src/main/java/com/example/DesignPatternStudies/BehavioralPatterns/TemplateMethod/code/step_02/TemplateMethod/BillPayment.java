package com.example.DesignPatternStudies.BehavioralPatterns.TemplateMethod.code.step_02.TemplateMethod;

public class BillPayment extends Payment {
    private final String TICKET_NUMBER;

    public BillPayment(String ticketNumber) {
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

}
