package com.example.DesignPatternStudies.BehavioralPatterns.ChainOfResponsibility.code;

import com.example.DesignPatternStudies.BehavioralPatterns.ChainOfResponsibility.code.dto.ShoppingCartRequest;

public class BaseValidator implements Validator {
    protected Validator next;

    @Override
    public void valid(ShoppingCartRequest request) {
        if(next != null) {
            next.valid(request);
        }
    }

    public void setNext(Validator next) {
        this.next = next;
    }
}
