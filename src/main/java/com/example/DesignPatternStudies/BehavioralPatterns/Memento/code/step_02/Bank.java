package com.example.DesignPatternStudies.BehavioralPatterns.Memento.code.step_02;

import java.util.ArrayList;
import java.util.List;

public class Bank implements IBank{
    private final List<Transaction> transaction;
    private final CheckingAccount account;

    public Bank(CheckingAccount account) {
        this.transaction = new ArrayList<>();
        this.account = account;
    }

    public void saveTransaction() {
        transaction.add(account.save());
    }

    public void undoTransaction() {
        transaction.removeLast();
        var lastTransaction = transaction.removeLast();
        lastTransaction.restore();
        System.out.println("UNDOING TRANSACTION");
    }

    public void showTransactions() {
        transaction.forEach(System.out::println);
    }
}
