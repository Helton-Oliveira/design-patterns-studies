package com.example.DesignPatternStudies.behavioralPatterrns;
import com.example.DesignPatternStudies.BehavioralPatterns.ChainOfResponsibility.code.ValidateShoppingCart;
import com.example.DesignPatternStudies.BehavioralPatterns.ChainOfResponsibility.code.dto.ShoppingCartRequest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ChainOfResponsibilityTest {

    @Test
    @DisplayName("Teste para validar dados do projeto de chain of responsibility")
    void validadeOrder() {
        ValidateShoppingCart validate = new ValidateShoppingCart();
        var request = new ShoppingCartRequest("computer", 3, "SP", "1234567890474589");
        validate.execute(request);
    }
}
