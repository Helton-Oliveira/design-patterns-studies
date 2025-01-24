package com.example.DesignPatternStudies.behavioralPatterrns;

import com.example.DesignPatternStudies.BehavioralPatterns.Strategy.code.step_02.*;
import com.example.DesignPatternStudies.BehavioralPatterns.Strategy.code.step_02.Observer.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StrategyTest {

   /* @Test
    @DisplayName("Deve anunciar os valores das viagens para o usuário")
    void strategyStep_01() {
        var transport = new Transport();
        var app = new App(transport);

        app.requestBusPrice(10.0);
        app.requestMetroValue(10.0);
        app.requestTaxiFare(10.0);
    }*/

    @Test
    @DisplayName("Deve anunciar os valores das viagens para o usuário, avisar a troca do valor pelo clima, e alterar os estados dos transportes")
    void strategyStep_02() {
        var transport = new TransportStrategy();
        var pedro = new ConcreteUser("Pedro");
        var manager = new EventManager();
        manager.subscribe(pedro.getName(), pedro);
        var taxi = new Taxi(manager, pedro.getName());
        var bus = new Bus();
        var subway = new Subway();

        transport.setStrategy(taxi);
        taxi.underMaintenance();
        taxi.available();
        taxi.setClimate("rainy");
        transport.executeStrategy(13.0);

        transport.setStrategy(bus);
        bus.underMaintenance();
        transport.executeStrategy(13.0);

        transport.setStrategy(subway);
        subway.available();
        transport.executeStrategy(13.0);
    }
}
