package com.example.DesignPatternStudies.BehavioralPatterns.Observer.code.step02.Memento;

import com.example.DesignPatternStudies.BehavioralPatterns.Observer.code.step02.AppleShares;

public class ConcreteMemento implements Memento{
    private final AppleShares APPLE_SHARES;
    private final Double VALUE_ACTION;

    public ConcreteMemento(AppleShares appleShares, Double valueAction) {
        this.APPLE_SHARES = appleShares;
        this.VALUE_ACTION = valueAction;
    }

    @Override
    public void restore() {
        APPLE_SHARES.setValueAction(VALUE_ACTION);
    }

    @Override
    public String toString() {
        return  VALUE_ACTION.toString();
    }
}
