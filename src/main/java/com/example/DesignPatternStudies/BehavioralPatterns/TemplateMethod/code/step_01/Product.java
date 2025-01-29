package com.example.DesignPatternStudies.BehavioralPatterns.TemplateMethod.code.step_01;

public class Product {
    private final String NAME;
    private final Double PRICE;

    public Product(String name, Double price) {
        this.NAME = name;
        this.PRICE = price;
    }

    public String getNAME() {
        return NAME;
    }

    public Double getPRICE() {
        return PRICE;
    }
}
