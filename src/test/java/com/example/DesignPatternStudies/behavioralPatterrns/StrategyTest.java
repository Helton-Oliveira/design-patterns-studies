package com.example.DesignPatternStudies.behavioralPatterrns;

import com.example.DesignPatternStudies.BehavioralPatterns.Strategy.code.step_01.App;
import com.example.DesignPatternStudies.BehavioralPatterns.Strategy.code.step_01.Transport;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StrategyTest {

    @Test
    @DisplayName("Deve anunciar os valores das viagens para o usuário")
    void strategyStep_01() {
        var transport = new Transport();
        var app = new App(transport);

        app.requestBusPrice(10.0);
        app.requestMetroValue(10.0);
        app.requestTaxiFare(10.0);
    }
}
