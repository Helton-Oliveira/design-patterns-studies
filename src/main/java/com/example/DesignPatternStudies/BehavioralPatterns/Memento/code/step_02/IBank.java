package com.example.DesignPatternStudies.BehavioralPatterns.Memento.code.step_02;

public interface IBank {
    void saveTransaction();
    void undoTransaction();
    void showTransactions();
}
