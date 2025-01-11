package com.example.DesignPatternStudies.BehavioralPatterns.Mediator.code.step_02;

import com.example.DesignPatternStudies.BehavioralPatterns.Mediator.code.step_02.command.Invoker;
import com.example.DesignPatternStudies.BehavioralPatterns.Mediator.code.step_02.command.RequestFuel;
import com.example.DesignPatternStudies.BehavioralPatterns.Mediator.code.step_02.command.RequestOxygen;
import com.example.DesignPatternStudies.BehavioralPatterns.Mediator.code.step_02.command.RequestRepairParts;
import com.example.DesignPatternStudies.BehavioralPatterns.Mediator.code.step_02.iterator.SpaceshipCollection;

public class ConcreteControlCenter implements ControlCenter{
    private final SpaceStation spaceStation;
    private final Planet planet;
    private final SpaceshipCollection spaceshipCollection;
    private final Invoker invoker;


    public ConcreteControlCenter(SpaceStation spaceStation, Planet planet, SpaceshipCollection spaceshipCollection, Invoker invoker) {
        this.spaceStation = spaceStation;
        this.planet = planet;
        this.spaceshipCollection = spaceshipCollection;
        this.invoker = invoker;
    }

    @Override
    public String notify(Spaceship spaceship, String acton) {
        String reason = spaceship.getLandingReason();
        if (!availableResource(reason)) {
            sendCommandForRefueling(spaceStation.getStationName(), reason);
            return "SOLICITAÇÃO DE POUSO NEGADA! SOLICITANDO REABASTECIMENTO DE RECURSOS NA ESTAÇÃO";
        }
        registerInTheCollection(spaceship);
        return consumeSpaceshipCollection();
    }

    private void registerInTheCollection(Spaceship spaceship) {
        spaceshipCollection.addSpaceshipToCollection(spaceship);
    }

    private String consumeSpaceshipCollection() {
        var iterator = spaceshipCollection.createSpaceshipIterator();
        Spaceship spaceship = iterator.getNext();

        if(spaceship.getLandingReason().equalsIgnoreCase("oxygen")) {
            spaceStation.deliveryOxygens();
            return spaceship.getIdentifiedShip() + " REPONDO OXIGÊNIO EM " + spaceStation.getStationName() + ". SISTEMA DE SUPORTE DE VIDA ESTÁVEL";
        }
        if(spaceship.getLandingReason().equalsIgnoreCase("fuel")) {
            spaceStation.deliveryFuelCylinder();
            return spaceship.getIdentifiedShip() + " REABASTECENDO COMBUSTÍVEL EM " + spaceStation.getStationName() + ". MOTORES PRONTOS PARA DECOLAGEM.";
        }
        if(spaceship.getLandingReason().equalsIgnoreCase("damage")) {
            spaceStation.provideRepairPart();
            return spaceship.getIdentifiedShip() + " INICIANDO REPAROS. INTEGRIDADE ESTRUTURAL EM AVALIAÇÃO";
        }

        return "REABASTECIMENTOS TERMINADOS...";
    }

    private void sendCommandForRefueling(String stationName, String resource) {
        if(resource.equalsIgnoreCase("oxygen")) {
            invoker.setCommand(new RequestOxygen(planet, stationName));
        }
        if(resource.equalsIgnoreCase("fuel")) {
            invoker.setCommand(new RequestFuel(planet, stationName));
        }
        if(resource.equalsIgnoreCase("damage")) {
            invoker.setCommand(new RequestRepairParts(planet, stationName));
        }
        var resourceQuantity = invoker.executeCommand();
        spaceStation.replenishResource(stationName, resourceQuantity);
    }


    private boolean availableResource(String reason) {
        boolean isHas = false;

        if (reason.equalsIgnoreCase("oxygen")) isHas = spaceStation.hasOxygen();
        if (reason.equalsIgnoreCase("fuel")) isHas = spaceStation.hasFuel();
        if (reason.equalsIgnoreCase("damage")) isHas = spaceStation.hasPartsForRepair();

        return isHas;
    }
}
