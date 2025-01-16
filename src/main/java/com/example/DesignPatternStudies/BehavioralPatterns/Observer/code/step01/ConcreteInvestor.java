package com.example.DesignPatternStudies.BehavioralPatterns.Observer.code.step01;

public class ConcreteInvestor implements Investor{
    private Double availableBalance;
    private final String name;

    public ConcreteInvestor(Double availableBalance, String name) {
        this.availableBalance = availableBalance;
        this.name = name;
    }

    @Override
    public void notify(Double newValue) {
        if(newValue < availableBalance) {
            buyAction();
            availableBalance -= newValue;
        } else {
            sellAction();
            availableBalance += newValue;
        }
    }

    public void buyAction() {
        System.out.println(this.name + " comprou a ação");
    }

    public void sellAction() {
        System.out.println(this.name + " vendeu a ação");
    }

}
