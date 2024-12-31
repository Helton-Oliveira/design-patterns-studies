package com.example.DesignPatternStudies.BehavioralPatterns.ChainOfResponsibility.code;

import com.example.DesignPatternStudies.BehavioralPatterns.ChainOfResponsibility.code.dto.ShoppingCartRequest;

import java.util.HashMap;
import java.util.Map;

public class ValidateItemAvailability extends BaseValidator {
    private final Map<String, Integer> productList = new HashMap<>();

    public ValidateItemAvailability() {
        productList.put("computer", Integer.valueOf(10));
    }

    @Override
    public void valid(ShoppingCartRequest request) {
        var productName = request.productName();
        if (!productList.containsKey(productName) && productList.get(productName) >= request.quantity()) {
            throw new RuntimeException("PRODUTO INSUFICIENTE");
        }
    }
}
