package com.example.DesignPatternStudies.BehavioralPatterns.ChainOfResponsibility.code;

import com.example.DesignPatternStudies.BehavioralPatterns.ChainOfResponsibility.code.dto.ShoppingCartRequest;

public class ValidateCreditCard extends BaseValidator {

    @Override
    public void valid(ShoppingCartRequest request) {
        if (request.creditCardNumber().length() != 16) {
            throw new RuntimeException("ERRO NUMERO DO CARTÃO INVÁLIDO");
        }
        next.valid(request);
    }
}
