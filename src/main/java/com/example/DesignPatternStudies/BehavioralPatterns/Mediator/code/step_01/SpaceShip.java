package com.example.DesignPatternStudies.BehavioralPatterns.Mediator.code.step_01;

public class SpaceShip {
    private String shipIdentifier;
    private Integer oxygenLevel;
    private Integer fuelLevel;
    private String condition;
    private String status;
    private ControlCenter controlCenter;

    public SpaceShip(String shipIdentifier, Integer oxygenLevel, Integer fuelLevel, String status, String condition, ControlCenter controlCenter) {
        this.shipIdentifier = shipIdentifier;
        this.oxygenLevel = oxygenLevel;
        this.fuelLevel = fuelLevel;
        this.status = status;
        this.condition = condition;
        this.controlCenter = controlCenter;
    }

    public String getShipIdentifier() {
        return shipIdentifier;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public void setOxygenLevel(Integer oxygenLevel) {
        this.oxygenLevel = oxygenLevel;
    }

    public void setFuelLevel(Integer fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void requestLanding() {
        System.out.println(controlCenter.notify(this, "land"));
    }

    public void requestTakeoff(){
        System.out.println(controlCenter.notify(this, "takeoff"));
    }

    public Integer getOxygenLevel() {
        return oxygenLevel;
    }

    public Integer getFuelLevel() {
        return fuelLevel;
    }

    public String getStatus() {
        return status;
    }
}
