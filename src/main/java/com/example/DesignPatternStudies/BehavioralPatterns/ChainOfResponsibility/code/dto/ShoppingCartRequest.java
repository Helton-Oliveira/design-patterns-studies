package com.example.DesignPatternStudies.BehavioralPatterns.ChainOfResponsibility.code.dto;

public record ShoppingCartRequest(
        String productName,
        int quantity,
        String uf,
        String creditCardNumber) {
}
