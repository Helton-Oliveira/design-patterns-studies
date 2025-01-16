package com.example.DesignPatternStudies.BehavioralPatterns.Observer.code.step02.Memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private final List<Memento> mementos = new ArrayList<>();
    private Originator originator;

    public void backup() {
        mementos.add(originator.save());
    }

    public void undo() {
        var m = mementos.removeLast();
        m.restore();
    }

    public List<Memento> catchActionsVariations() {
        return mementos;
    }

    public void setOriginator(Originator originator) {
        this.originator = originator;
    }
}
