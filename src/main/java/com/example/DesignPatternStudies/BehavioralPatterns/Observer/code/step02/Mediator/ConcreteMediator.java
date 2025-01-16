package com.example.DesignPatternStudies.BehavioralPatterns.Observer.code.step02.Mediator;

import com.example.DesignPatternStudies.BehavioralPatterns.Observer.code.step02.AppleShares;
import com.example.DesignPatternStudies.BehavioralPatterns.Observer.code.step02.Investor;
import com.example.DesignPatternStudies.BehavioralPatterns.Observer.code.step02.Memento.Caretaker;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {
    private final Caretaker caretaker;
    private final List<Investor> investors = new ArrayList<>();

    public ConcreteMediator(Caretaker caretaker) {
        this.caretaker = caretaker;
    }

    @Override
    public void notify(AppleShares appleShares) {
        this.caretaker.setOriginator(appleShares);
        caretaker.backup();
        notifySubscribes();
    }

    public void subscribe(Investor investor) {
        System.out.println(investor.toString() +  " se inscreveu para receber notificações das ações desta empresa");
        investors.add(investor);
    }

    public void unsubscribe(Investor investor) {
        System.out.println(investor.toString() + " se desinscreveu, não receberá mais notificações das ações desta empresa");
        investors.remove(investor);
    }

    public void notifySubscribes() {
        investors.forEach(investor -> investor.update(
                        caretaker.catchActionsVariations()
                                .stream()
                                .map(c -> Double.parseDouble(c.toString()))
                                .toList()
                ));
    }
}
