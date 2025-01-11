package com.example.DesignPatternStudies.behavioralPatterrns;

import com.example.DesignPatternStudies.BehavioralPatterns.Mediator.code.step_02.ConcreteControlCenter;
import com.example.DesignPatternStudies.BehavioralPatterns.Mediator.code.step_02.Planet;
import com.example.DesignPatternStudies.BehavioralPatterns.Mediator.code.step_02.SpaceStation;
import com.example.DesignPatternStudies.BehavioralPatterns.Mediator.code.step_02.Spaceship;
import com.example.DesignPatternStudies.BehavioralPatterns.Mediator.code.step_02.command.ConcreteInvoker;
import com.example.DesignPatternStudies.BehavioralPatterns.Mediator.code.step_02.iterator.ConcreteSpaceshipCollection;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MediatorTest {


/*    @Test
    @DisplayName("Deve mediar voos das aeronaves")
    void mediatorTest_step01() {
        ControlCenter controlCenter = new ConcreteControlCenter();
        var explorer07 = new SpaceShip("EXPLORER-07", 39, 70, "in orbit", "excellent", controlCenter);
        var explorer03 = new SpaceShip("EXPLORER-03", 90, 30, "in orbit", "excellent", controlCenter);

        explorer07.requestLanding();
        explorer03.requestLanding();
        explorer03.requestTakeoff();
    }*/

    @Test
    @DisplayName("Deve mediar voos das naves espaciais step_02")
    void mediatorTest_step02() {
        var planet = new Planet(10, 7, 20);
        var spaceStation = new SpaceStation("ZULU-2", 3, 2, 8);
        var collection = new ConcreteSpaceshipCollection();
        var invoker = new ConcreteInvoker();
        var mediator = new ConcreteControlCenter(spaceStation, planet, collection, invoker);
        var alpha07 = new Spaceship("APLHA-17", 30, 70, "totalIntegrity", mediator);
        var beta09 = new Spaceship("BETA-09", 50, 30, "damage", mediator);
        var gamma22 = new Spaceship("GAMMA-22", 90, 30, "totalIntegrity", mediator);
        var delta34 = new Spaceship("DELTA-34", 75, 30, "totalIntegrity", mediator);
        var epsilon45 = new Spaceship("EPSILON-45", 100, 30, "totalIntegrity", mediator);
        var zeta56 = new Spaceship("ZETA-56", 60, 30, "totalIntegrity", mediator);

        alpha07.requestLandingForRefueling();
        delta34.requestLandingRecoveryOxygen();
        epsilon45.requestLandingRecoveryOxygen();
        zeta56.requestLandingRecoveryOxygen();
        gamma22.requestLandingRecoveryOxygen();
        beta09.requestLandingRecoveryOxygen();
        beta09.requestLandingForRepairs();

        planet.runReport();
    }
}
