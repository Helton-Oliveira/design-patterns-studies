package com.example.DesignPatternStudies.BehavioralPatterns.Memento.code.step_02;

import java.time.LocalDate;

public class ConcreteTransaction implements Transaction {
    private final Double balance;
    private final String operation;
    private final Long accountNumber;
    private final String accountHolder;
    private final String agency;
    private final ConcreteCheckingAccount checkingAccount;
    private final Double transactionValue;

    public ConcreteTransaction(ConcreteCheckingAccount checkingAccount, Double balance, String operation, Long accountNumber, String accountHolder, String agency, Double transactionValue) {
        this.balance = balance;
        this.operation = operation;
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.agency = agency;
        this.checkingAccount = checkingAccount;
        this.transactionValue = transactionValue;
    }

    @Override
    public void restore() {
        checkingAccount.setAccountNumber(this.accountNumber);
        checkingAccount.setAccountHolder(this.accountHolder);
        checkingAccount.setBalance(this.balance);
        checkingAccount.setOperation(this.operation);
        checkingAccount.setAgency(this.agency);
        checkingAccount.setTransactionValue(this.transactionValue);
    }

    @Override
    public String toString() {
        return String.format("""
                %s - %s sent in the amount of %.2f
                current balance: %.2f
                """, LocalDate.now(), this.operation, this.transactionValue, this.balance);
    }
}
