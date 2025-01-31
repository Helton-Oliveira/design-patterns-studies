package com.example.DesignPatternStudies.BehavioralPatterns.TemplateMethod.code.step_02;

public class Product {
    private final String name;
    private final Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;

    }
    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}
