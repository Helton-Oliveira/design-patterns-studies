package com.example.DesignPatternStudies.BehavioralPatterns.Memento.code.step_02;

import com.example.DesignPatternStudies.BehavioralPatterns.Memento.code.step_02.chainOfResponsibility.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ConcreteCheckingAccount implements CheckingAccount{
    private Double balance;
    private Long accountNumber;
    private String accountHolder;
    private String agency;
    private String operation;
    private final BaseValidator baseValidator;
    private Double transactionValue;
    private final IBank bank;

    public ConcreteCheckingAccount(Double balance, String accountHolder, Long accountNumber, String agency) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.agency = agency;
        this.bank = new Bank(this);
        baseValidator = new BaseValidator(bank);
        setValidationHierarchy();
    }

    @Override
    public Transaction save() {
        return new ConcreteTransaction(this, this.balance, this.operation, this.accountNumber, this.accountHolder, this.agency, this.transactionValue);
    }

    public void makePix(String to, Double value) {
        this.operation = "pix";
        this.transactionValue = value;
        var transaction = new TransactionDTO(to, this.balance, LocalDate.now(), LocalDateTime.now(), operation, value);
        balance -= value;
        bank.saveTransaction();
        baseValidator.valid(transaction);
    }

    public void makeDeposit(Double value) {
        this.operation = "deposit";
        this.transactionValue = value;
        balance += value;
        bank.saveTransaction();
    }

    public void pay(String to ,Double value) {
        this.operation = "payment";
        this.transactionValue = value;
        var transaction = new TransactionDTO(to, this.balance, LocalDate.now(), LocalDateTime.now(), operation, value);
        balance -= value;
        bank.saveTransaction();
        baseValidator.valid(transaction);
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void setTransactionValue(Double transactionValue) {
        this.transactionValue = transactionValue;
    }

    public void showHistoryTransactions() {
        bank.showTransactions();
    }

    private void setValidationHierarchy() {
        this.baseValidator
                .setNext(new ValidateAvailableBalance(bank))
                .setNext(new ValidateBeneficiaryAccount(bank))
                .setNext(new ValidateTransactionTime(bank))
                .setNext(new ValidatePixLimit(bank))
                .setNext(new ValidatePayLimit(bank));
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public void showBalance() {
        System.out.println( "Saldo atual: "  + this.balance);
    }
}
