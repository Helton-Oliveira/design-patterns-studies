package com.example.DesignPatternStudies.BehavioralPatterns.Mediator.code.step_02;

public class Spaceship {
    private final String identifiedShip;
    private final Integer fuel;
    private final Integer oxygen;
    private final String spaceshipConditions;
    private String landingReason;
    private final ControlCenter controlCenter;

    public Spaceship(String identifiedShip, Integer fuel, Integer oxygen, String spaceshipConditions, ControlCenter controlCenter) {
        this.identifiedShip = identifiedShip;
        this.fuel = fuel;
        this.oxygen = oxygen;
        this.spaceshipConditions = spaceshipConditions;
        this.controlCenter = controlCenter;
    }

    public void requestLandingForRefueling() {
        if((fuel >= 40)) {
            System.out.println("NAVE COM NÍVEL DE COMBUSTÍVEL AINDA OPERÁVEL");
        } else {
            System.out.println("NIVEIS DE COMBUSTÍVEL CRÍTICOS" + identifiedShip + " SOLICITANDO POUSO PARA REABASTECIMENTO");
            landingReason = "fuel";
            var response = controlCenter.notify(this, landingReason);
            System.out.println(response);
        }
    }

    public void requestLandingRecoveryOxygen() {
        if((oxygen >= 40)) {
            System.out.println("NAVE COM NÍVEL DE OXIGÊNIO ESTÁVEL");
        } else {
            System.out.println("OXIGÊNIO EM NÍVEL CRÍTICO " + identifiedShip + " SOLICITANDO POUSO PARA REABASTECIMENTO");
            landingReason = "oxygen";
            var response = controlCenter.notify(this, landingReason);
            System.out.println(response);
        }
    }

    public void requestLandingForRepairs() {
        if(!spaceshipConditions.equalsIgnoreCase("damage")) {
            System.out.println("NAVE AINDA OPERÁVEL");
        } else {
            System.out.println("NAVE DANIFICADA " + identifiedShip + " SOLICITANDO POUSO PARA REPAROS");
            landingReason = "damage";
            var response = controlCenter.notify(this, landingReason);
            System.out.println(response);
        }
    }

    public String getIdentifiedShip() {
        return identifiedShip;
    }

    public String getLandingReason() {
        return landingReason;
    }
}
