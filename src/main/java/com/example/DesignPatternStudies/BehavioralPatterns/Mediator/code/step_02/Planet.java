package com.example.DesignPatternStudies.BehavioralPatterns.Mediator.code.step_02;

import java.util.ArrayList;
import java.util.List;

public class Planet {
    private final Integer OXYGEN_CYLINDERS ;
    private final Integer FUEL_CYLINDERS ;
    private final Integer REPAIR_PARTS ;
    private final List<String> resourceControlReport = new ArrayList<>();

    public Planet(Integer oxygenCylinders, Integer fuelCylinders, Integer repairParts) {
        OXYGEN_CYLINDERS = oxygenCylinders;
        FUEL_CYLINDERS = fuelCylinders;
        REPAIR_PARTS = repairParts;
    }

    public int replenishFuelResource(){
        return FUEL_CYLINDERS;
    }

    public int replenishOxygen() {
        return OXYGEN_CYLINDERS;
    }
    public int replenishParts() {
        return REPAIR_PARTS;
    }

    public void requestReport(Integer quantity, String resource, String spaceStationName) {
        resourceControlReport.add(String.format("""
                =========== Relatório de Pedidos ===========
                %d DE %s PARA A ESTAÇÃO ESPACIAL %s
                ============================================
                """, quantity, resource, spaceStationName));
    }

    public void runReport() {
        resourceControlReport.forEach(System.out::println);
    }

}
