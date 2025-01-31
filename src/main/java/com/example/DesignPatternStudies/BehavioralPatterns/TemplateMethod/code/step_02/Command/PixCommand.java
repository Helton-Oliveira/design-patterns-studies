package com.example.DesignPatternStudies.BehavioralPatterns.TemplateMethod.code.step_02.Command;

import com.example.DesignPatternStudies.BehavioralPatterns.TemplateMethod.code.step_02.Checkout;
import com.example.DesignPatternStudies.BehavioralPatterns.TemplateMethod.code.step_02.TemplateMethod.PixPayment;
import com.example.DesignPatternStudies.BehavioralPatterns.TemplateMethod.code.step_02.Product;

import java.util.List;
import java.util.Map;

public class  PixCommand extends Command {

    public PixCommand(Map<String, String> paymentData, List<Product> products, Checkout checkout) {
        super(paymentData, products, checkout);
    }

    @Override
    public void execute() {
        var totalValueOfProducts = this.calculateTotal();

        System.out.printf("""
                \n
                --- Dados da compra ---
                Método de pagamento: PIX
                Valor total da compra: R$ %.2f
                -----------------------
                """, totalValueOfProducts);

        checkout.setPayment(new PixPayment(paymentData.get("pixKey")));
    }

}
