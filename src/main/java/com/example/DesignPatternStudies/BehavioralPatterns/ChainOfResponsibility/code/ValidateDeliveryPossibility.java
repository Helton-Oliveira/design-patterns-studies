package com.example.DesignPatternStudies.BehavioralPatterns.ChainOfResponsibility.code;

import com.example.DesignPatternStudies.BehavioralPatterns.ChainOfResponsibility.code.dto.ShoppingCartRequest;

public class ValidateDeliveryPossibility extends BaseValidator {

    @Override
    public void valid(ShoppingCartRequest request) {
        if (!request.uf().equalsIgnoreCase("SP")) {
            throw new RuntimeException("ESTA LOJA ACEITA APENAS ENTREGAS EM SP");
        }
        next.valid(request);
    }
}
