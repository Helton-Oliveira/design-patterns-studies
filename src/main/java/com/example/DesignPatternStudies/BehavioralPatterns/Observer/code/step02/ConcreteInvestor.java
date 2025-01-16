package com.example.DesignPatternStudies.BehavioralPatterns.Observer.code.step02;

import java.util.List;

public class ConcreteInvestor implements Investor {
    private final String name;

    public ConcreteInvestor(String name) {
        this.name = name;
    }

    @Override
    public void update(List<Double> actionsValues) {
        int x = 0;
        int j = 0;

        for (int i = 0; i < actionsValues.size() - 1; i++) {
            int a = i + 1;

            if(actionsValues.get(i) < actionsValues.get(a)) {
                x++;
            }

            if(actionsValues.get(i) > actionsValues.get(a)) {
                j++;
            }
        }

        if(x > j) {
            System.out.println(this.name + " investiu na ação");
        } else {
            System.out.println(this.name + " não investiu na ação");
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
