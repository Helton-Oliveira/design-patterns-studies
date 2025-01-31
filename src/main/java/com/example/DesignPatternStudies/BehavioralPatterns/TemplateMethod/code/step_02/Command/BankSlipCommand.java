package com.example.DesignPatternStudies.BehavioralPatterns.TemplateMethod.code.step_02.Command;

import com.example.DesignPatternStudies.BehavioralPatterns.TemplateMethod.code.step_02.TemplateMethod.BillPayment;
import com.example.DesignPatternStudies.BehavioralPatterns.TemplateMethod.code.step_02.Checkout;
import com.example.DesignPatternStudies.BehavioralPatterns.TemplateMethod.code.step_02.Product;

import java.util.List;
import java.util.Map;

public class BankSlipCommand extends Command {

    public BankSlipCommand(Map<String, String> paymentData, List<Product> products, Checkout checkout) {
        super(paymentData, products, checkout);
    }

    @Override
    public void execute() {
        var totalValuesOfProducts = this.calculateTotal();
        var billGenerationFee = 5;

        System.out.printf("""
                \n
                ----- Dados da Compra -----
                Método de pagamento: BOLETO BANCÁRIO
                Valor da taxa sob geração de boleto bancário: %d
                Valor total da compra: R$ %.2f
                ------------------------
                \n
                """, billGenerationFee, (totalValuesOfProducts + billGenerationFee));

        checkout.setPayment(new BillPayment(paymentData.get("bankSlip")));
    }

}
