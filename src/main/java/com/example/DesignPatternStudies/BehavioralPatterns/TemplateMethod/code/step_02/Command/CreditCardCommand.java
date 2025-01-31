package com.example.DesignPatternStudies.BehavioralPatterns.TemplateMethod.code.step_02.Command;

import com.example.DesignPatternStudies.BehavioralPatterns.TemplateMethod.code.step_02.Checkout;
import com.example.DesignPatternStudies.BehavioralPatterns.TemplateMethod.code.step_02.TemplateMethod.CreditCardPayment;
import com.example.DesignPatternStudies.BehavioralPatterns.TemplateMethod.code.step_02.Product;

import java.util.List;
import java.util.Map;

public class CreditCardCommand extends Command {

    public CreditCardCommand(Map<String, String> paymentData, List<Product> products, Checkout checkout) {
        super(paymentData, products, checkout);
    }

    @Override
    public void execute() {
        var total = this.calculateTotal();
        var installments = Integer.parseInt(paymentData.get("installments"));
        var totalPerInstallment = total / installments;

        System.out.printf("""
                \n
                --- Dados da compra ------------------------
                Método de pagamento: Cartão de Crédito
                Total de parcelas: %d
                valor total: R$ %.2f
                valor por parcela: R$ %.2f
                clique em confirmar para prosseguir com a compra...
                ---------------------------------------------
                """, installments ,total ,totalPerInstallment);

        checkout.setPayment(
                new CreditCardPayment(
                        paymentData.get("creditCard"),
                        paymentData.get("securityCardCode"))
                );
    }

}
