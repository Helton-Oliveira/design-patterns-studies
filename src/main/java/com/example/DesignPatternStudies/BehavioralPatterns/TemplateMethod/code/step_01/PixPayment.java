package com.example.DesignPatternStudies.BehavioralPatterns.TemplateMethod.code.step_01;

import java.util.List;

public class PixPayment extends Payment {
    private final String PIX_KEY;

    protected PixPayment(List<Product> products, String pixKey) {
        super(products);
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

    @Override
    protected void generateReceipt() {
        Double total = Double.valueOf(products
                .stream()
                .reduce(0, (subtotal, next) -> (int) (subtotal + next.getPRICE()), Integer::sum));

        System.out.printf("""
                ====== Recibo ======
                Valor total da compra: %.2f
                ====================
                """, total);
    }
}
