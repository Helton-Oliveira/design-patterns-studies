package com.example.DesignPatternStudies.behavioralPatterrns;

import com.example.DesignPatternStudies.BehavioralPatterns.Observer.code.step02.*;
import com.example.DesignPatternStudies.BehavioralPatterns.Observer.code.step02.Mediator.*;


import com.example.DesignPatternStudies.BehavioralPatterns.Observer.code.step02.Memento.Caretaker;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class ObserverTest {

    /*@Test
    @DisplayName("Deve notificar investidor sobre ação")
    void observerProjectStep_01() {
        var action = new AppleShares(500.0);
        var investor1 = new ConcreteInvestor(2000.0, "Richard");
        var investor2 = new ConcreteInvestor(4000.0, "Robert");

        action.subscribe(investor1);
        action.subscribe(investor2);

        action.valueAction(0.3);
        action.valueAction(0.3);
        action.valueAction(0.3);

    }*/

    @Test
    @DisplayName("Deve notificar investidor sobre ação")
    void observerProjectStep_02() {
        var tonyStark = new ConcreteInvestor("Tony Stark");
        var steveRogers = new ConcreteInvestor("Steve Rogers");
        var bruceBanner = new ConcreteInvestor("Bruce Banner");
        var caretaker = new Caretaker();
        var mediator = new ConcreteMediator(caretaker);
        var appleShare = new AppleShares(400.0, mediator);

        mediator.subscribe(tonyStark);
        mediator.subscribe(steveRogers);
        mediator.subscribe(bruceBanner);

        appleShare.toValue(0.30);
        appleShare.toValue(0.5);
        appleShare.devalue(0.7);
        appleShare.toValue(0.10);

        mediator.unsubscribe(bruceBanner);

    }
}
