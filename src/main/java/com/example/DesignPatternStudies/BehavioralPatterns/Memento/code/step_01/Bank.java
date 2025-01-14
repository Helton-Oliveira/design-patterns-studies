package com.example.DesignPatternStudies.BehavioralPatterns.Memento.code.step_01;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private final List<Stratum> stratumList = new ArrayList<>();
    private final CheckingAccount checkingAccount;

    public Bank(CheckingAccount checkingAccount) {
        this.checkingAccount = checkingAccount;
    }

    public void backup() {
        stratumList.add(checkingAccount.save());
    }

    public void undoTransaction() {
        var stratum = stratumList.removeLast();
        stratum.restore();
    }

    public void ShowLastMonthStatement() {
        stratumList.forEach(System.out::println);
    }
}
