package com.example.DesignPatternStudies.BehavioralPatterns.Mediator.code.step_02;

public class SpaceStation {
    private final String stationName;
    private Integer availableOxygens;
    private Integer fuelAvailable;
    private Integer remainingPieces;

    public SpaceStation(String stationName, Integer availableOxygens, Integer fuelAvailable, Integer remainingPieces) {
        this.stationName = stationName;
        this.availableOxygens = availableOxygens;
        this.fuelAvailable = fuelAvailable;
        this.remainingPieces = remainingPieces;
    }

    public void replenishResource(String resource, Integer quantity) {
        if(resource.equalsIgnoreCase("oxygen")) availableOxygens = quantity;
        if(resource.equalsIgnoreCase("fuel")) fuelAvailable = quantity;
        if(resource.equalsIgnoreCase("parts")) remainingPieces = quantity;
    }

    public String getStationName() {
        return stationName;
    }

    public void deliveryOxygens(){
        availableOxygens--;
    }

    public void deliveryFuelCylinder(){
        fuelAvailable--;
    }

    public void provideRepairPart() {
        remainingPieces--;
    }

    public boolean hasFuel() {
        return fuelAvailable > 0;
    }

    public boolean hasOxygen() {
        return availableOxygens > 0;
    }

    public boolean hasPartsForRepair() {
        return remainingPieces > 0;
    }
}
