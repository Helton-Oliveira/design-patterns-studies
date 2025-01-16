package com.example.DesignPatternStudies.behavioralPatterrns;

import com.example.DesignPatternStudies.BehavioralPatterns.Observer.code.step01.AppleShares;
import com.example.DesignPatternStudies.BehavioralPatterns.Observer.code.step01.ConcreteInvestor;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ObserverTest {

    @Test
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

    }
}
