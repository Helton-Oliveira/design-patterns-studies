package com.example.DesignPatternStudies.BehavioralPatterns.Observer.code.step02;

import com.example.DesignPatternStudies.BehavioralPatterns.Observer.code.step02.Mediator.Mediator;
import com.example.DesignPatternStudies.BehavioralPatterns.Observer.code.step02.Memento.ConcreteMemento;
import com.example.DesignPatternStudies.BehavioralPatterns.Observer.code.step02.Memento.Memento;
import com.example.DesignPatternStudies.BehavioralPatterns.Observer.code.step02.Memento.Originator;

public class AppleShares implements Originator {
    private Double valueAction;
    private final Mediator mediator;

    public AppleShares(Double valueAction, Mediator mediator) {
        this.valueAction = valueAction;
        this.mediator = mediator;
    }

    @Override
    public Memento save() {
        return new ConcreteMemento(this, this.valueAction);
    }

    public void toValue(Double percent) {
        mediator.notify(this);
        valueAction += (valueAction * percent);
    }

    public void devalue(Double percent) {
        mediator.notify(this);
        valueAction -= (valueAction * percent);
    }

    public void setValueAction(Double valueAction) {
        mediator.notify(this);
        this.valueAction = valueAction;
    }
}
