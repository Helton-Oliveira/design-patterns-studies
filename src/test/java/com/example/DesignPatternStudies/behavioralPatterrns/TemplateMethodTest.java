package com.example.DesignPatternStudies.behavioralPatterrns;

import com.example.DesignPatternStudies.BehavioralPatterns.TemplateMethod.code.step_02.Command.PaymentActionManager;
import com.example.DesignPatternStudies.BehavioralPatterns.TemplateMethod.code.step_02.Product;
import com.example.DesignPatternStudies.BehavioralPatterns.TemplateMethod.code.step_02.ShoppingCart;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class TemplateMethodTest {

    /*@Test
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
    }*/

    @Test
    @DisplayName("Deve utilizar vários meios de pagamento, sendo cartão de crédito, via pix e boleto")
    void templateMethod_step_01() {
        var invoker = new PaymentActionManager();
        var shoppingCart = new ShoppingCart(invoker);

        // DADOS PAGAMENTO
        Map<String,String> creditCardData = Map.of(
                "creditCard", "12345678934",
                "securityCardCode", "409",
                "installments", "10");

        Map<String,String> billPaymentData = Map.of(
                "bankSlip", "23790.12345 60000.123456 70000.123456 8 12345678901234");

        Map<String,String> pixPaymentData = Map.of(
                "pixKey", "3b1f5e20-8a9c-4f6b-91c3-e5f19e4d7a9a");

        // PRODUTOS
        var product1 = new Product("Camisa", 29.90);
        var product2 = new Product("Calça", 170.0);
        var product3 = new Product("Notebook", 2500.0);
        shoppingCart.addProduct(product1);
        shoppingCart.addProduct(product2);
        shoppingCart.addProduct(product3);
        shoppingCart.removeProduct(product1);
        var checkout = shoppingCart.continueShopping();

        // CARTÃO DE CRÉDITO
        checkout.insertPaymentData(creditCardData);

        // PIX
        checkout.insertPaymentData(pixPaymentData);

        //BOLETO
        checkout.insertPaymentData(billPaymentData);

        // REVERTENDO AÇÃO E PAGANDO POR CARTÃO DE CRÉDITO
        checkout.revertPayment();
        checkout.revertPayment();
        checkout.pay();
    }
}
