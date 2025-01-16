package com.example.DesignPatternStudies.BehavioralPatterns.Observer.code.step01;

import java.util.ArrayList;
import java.util.List;

public class AppleShares {
    private final List<Investor> investors = new ArrayList<>();
    private Double valueAction;

    public AppleShares(Double valueAction) {
        this.valueAction = valueAction;
    }

    public void subscribe(Investor investor) {
        investors.add(investor);
    }

    public void unSubscribe(Investor investor) {
        investors.remove(investor);
    }

    private void notifySubscribes() {
        investors.forEach(i -> i.notify(this.valueAction));
    }

    public void valueAction(Double percent) {
        this.valueAction += (valueAction * percent);
        notifySubscribes();
    }

    public void devalueAction(Double percent) {
        this.valueAction -= (valueAction * percent);
        notifySubscribes();
    }
}
