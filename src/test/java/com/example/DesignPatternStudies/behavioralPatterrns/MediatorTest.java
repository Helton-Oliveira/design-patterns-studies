package com.example.DesignPatternStudies.behavioralPatterrns;

import com.example.DesignPatternStudies.BehavioralPatterns.Mediator.code.step_01.SpaceShip;
import com.example.DesignPatternStudies.BehavioralPatterns.Mediator.code.step_01.ConcreteControlCenter;
import com.example.DesignPatternStudies.BehavioralPatterns.Mediator.code.step_01.ControlCenter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MediatorTest {


    @Test
    @DisplayName("Deve mediar voos das aeronaves")
    void mediatorTest_step01() {
        ControlCenter controlCenter = new ConcreteControlCenter();
        var explorer07 = new SpaceShip("EXPLORER-07", 39, 70, "in orbit", "excellent", controlCenter);
        var explorer03 = new SpaceShip("EXPLORER-03", 90, 30, "in orbit", "excellent", controlCenter);

        explorer07.requestLanding();
        explorer03.requestLanding();
        explorer03.requestTakeoff();
    }
}
