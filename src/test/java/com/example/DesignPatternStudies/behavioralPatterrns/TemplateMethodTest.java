package com.example.DesignPatternStudies.behavioralPatterrns;

import com.example.DesignPatternStudies.BehavioralPatterns.TemplateMethod.code.step_01.Product;
import com.example.DesignPatternStudies.BehavioralPatterns.TemplateMethod.code.step_01.ShoppingCart;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TemplateMethodTest {

    @Test
    @DisplayName("Deve utilizar vários meios de pagamento, sendo cartão de crédito, via pix e boleto")
    void templateMethod_step_01() {
        
        // Cartão de Crédito
        var product1 = new Product("Camisa", 29.90);
        var product2 = new Product("Calça", 170.0);

        var shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(product1);
        shoppingCart.addProduct(product2);

        shoppingCart.pay("12345678934", "409", 10);
        shoppingCart.confirmOrder();

        // PIX
        shoppingCart.pay("pix", "3b1f5e20-8a9c-4f6b-91c3-e5f19e4d7a9a");
        shoppingCart.confirmOrder();

        //BOLETO
        shoppingCart.pay("bankSlip", "23790.12345 60000.123456 70000.123456 8 12345678901234");
        shoppingCart.confirmOrder();
    }
}
