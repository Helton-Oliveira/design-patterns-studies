package com.example.DesignPatternStudies.BehavioralPatterns.ChainOfResponsibility.code;

import com.example.DesignPatternStudies.BehavioralPatterns.ChainOfResponsibility.code.dto.ShoppingCartRequest;

public interface Validator {
    void valid(ShoppingCartRequest request);
}
