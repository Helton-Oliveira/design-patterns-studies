package com.example.DesignPatternStudies.BehavioralPatterns.Mediator.code.step_01;

import com.example.DesignPatternStudies.BehavioralPatterns.Mediator.SpaceStation;

public class ConcreteControlCenter implements ControlCenter {
    private final SpaceStation spaceStation;

    public ConcreteControlCenter() {
        this.spaceStation = new SpaceStation();
    }

    @Override
    public String notify(SpaceShip spaceShip, String action) {
        if (action.equalsIgnoreCase("takeoff")) {
            if (spaceShip.getStatus().equalsIgnoreCase("in Mission") || spaceShip.getStatus().equalsIgnoreCase("in orbit")) return "SOLICITAÇÃO NEGADA! " +
                    spaceShip.getShipIdentifier() + " ESTÁ EM ÓRBITA OU MISSÃO";
            if (spaceShip.getCondition().equalsIgnoreCase("damage")) return "SOLICITAÇÃO NEGADA! " + spaceShip.getShipIdentifier() + " AINDA DANIFICADA";
            return "SOLICITAÇÃO AUTORIZADA! BOA VIAGEM " + spaceShip.getShipIdentifier();
        }
        if (action.equalsIgnoreCase("land")) {
            if(spaceShip.getStatus().equalsIgnoreCase("inn")) {
                spaceStation.parkSpacecraftForRepair();
                return "SOLICITAÇÃO NEGADA! NAVE JÁ ESTÁ POUSADA";
            }
            return checkLandingReason(spaceShip);
        }
        return "ERRO AÇÃO NÃO SUPORTADA!";
    }

    private String checkLandingReason(SpaceShip spaceShip) {
        if(spaceShip.getFuelLevel() <= 49 && spaceStation.hasFuel()) {
            spaceStation.deliverFuelCylinder();
            spaceShip.setFuelLevel(100);
            spaceShip.setStatus("inn");
            return "NAVE " + spaceShip.getShipIdentifier() + " POUSOU NA ESTAÇÃO " + spaceStation.getStationName() + ". REABASTECENDO... ";
        }
        if(spaceShip.getOxygenLevel() <= 49 && spaceStation.hasOxygen()) {
            spaceStation.deliveryOxygen();
            spaceShip.setOxygenLevel(100);
            spaceShip.setStatus("inn");
            return "NAVE " + spaceShip.getShipIdentifier() + " POUSOU NA ESTAÇÃO " + spaceStation.getStationName() + ". FORNECENDO OXIGÊNIO... ";
        }
        if (spaceShip.getCondition().equalsIgnoreCase("damaged") && spaceStation.thereIsASpaceForRepairs()) {
            spaceStation.parkSpacecraftForRepair();
            spaceShip.setCondition("repaired");
            spaceShip.setStatus("inn");
            return "NAVE " + spaceShip.getShipIdentifier() + " POUSOU NA ESTAÇÃO " + spaceStation.getStationName() + ". INICIANDO REPAROS... ";
        }
        return "SOLICITAÇÃO! NEGADA RECURSO INDISPONÍVEL NO MOMENTO";
    }
}
