package com.example.DesignPatternStudies.BehavioralPatterns.Memento.code.step_01;

import java.time.LocalDate;

public class ConcreteStratum implements Stratum {
    private final ConcreteCheckingAccount account;
    private final String accountHolder;
    private final Double balance;
    private final Long accountNumber;
    private final LocalDate transactionDate;
    private final String operation;
    private final Double value;

    public ConcreteStratum(ConcreteCheckingAccount account, String accountHolder, Double balance, Long accountNumber, String operation, Double value1) {
        this.account = account;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.operation = operation;
        this.value = value1;
        this.transactionDate = LocalDate.now();
    }

    @Override
    public void restore() {
        account.setAccountNumber(this.accountNumber);
        account.setBalance(this.balance);
        account.setAccountHolder(this.accountHolder);
        account.setOperation(this.operation);
    }

    @Override
    public String toString() {
        return String.format("""
                %s - %s realizou %s no valor de %.2f
                """, this.transactionDate.toString(), this.accountHolder, this.operation, this.value);
    }
}
