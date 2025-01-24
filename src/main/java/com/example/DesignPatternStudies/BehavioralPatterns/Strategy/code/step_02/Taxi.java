package com.example.DesignPatternStudies.BehavioralPatterns.Strategy.code.step_02;

import com.example.DesignPatternStudies.BehavioralPatterns.Strategy.code.step_02.Observer.EventManager;
import com.example.DesignPatternStudies.BehavioralPatterns.Strategy.code.step_02.State.Transport;

public class Taxi extends Transport implements Strategy {
    private Double RATE_PER_KILOMETER = 0.5;
    private final EventManager EVENT_MANAGER;
    private final String APPLICANT;

    public Taxi(EventManager eventManager, String applicant) {
        this.EVENT_MANAGER = eventManager;
        APPLICANT = applicant;
        setStrategy(this);
    }

    @Override
    public void execute(Double routeDistance) {
        Double APPROXIMATE_SPEED_OF_THE_TRACK = 50.0;
        var travelTime = (routeDistance / APPROXIMATE_SPEED_OF_THE_TRACK);
        double RATE_PER_MINUTE = 2.00;
        var fare = (RATE_PER_MINUTE * (travelTime * 60)) + (routeDistance * RATE_PER_KILOMETER);
        System.out.printf("A tarifa cobrada de Taxi é de:  %.2f %n",  fare);
    }

    public void setClimate(String climate) {
        switch (climate.toLowerCase()) {
            case "rainy" -> RATE_PER_KILOMETER = 3.5;
            case "cloudy" -> RATE_PER_KILOMETER = 2.0;
        }
        EVENT_MANAGER.notifySubscribe(APPLICANT, "Tarifa alterada devido a mudança de clima para " + climate);
    }
}
