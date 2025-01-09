package com.example.DesignPatternStudies.BehavioralPatterns.Mediator;

public class SpaceStation {
    private String stationName;
    private Integer availableOxygens;
    private Integer fuelCylindersAvailable;
    private Integer spaceShipCapacity;

    public SpaceStation() {
        this.availableOxygens = 10;
        this.fuelCylindersAvailable = 12;
        this.spaceShipCapacity = 5;
        this.stationName = "Alpha-3";
    }

    public void deliveryOxygen() {
        availableOxygens--;
    }

    public void deliverFuelCylinder() {
        fuelCylindersAvailable--;
    }

    public void parkSpacecraftForRepair() {
        spaceShipCapacity--;
    }

    public boolean hasOxygen() {
        return availableOxygens > 0;
    }

    public boolean hasFuel() {
        return fuelCylindersAvailable > 0;
    }

    public boolean thereIsASpaceForRepairs() {
        return spaceShipCapacity > 0;
    }

    public String getStationName() {
        return stationName;
    }
}
