package com.example.DesignPatternStudies.BehavioralPatterns.Memento.code.step_01;

public class ConcreteCheckingAccount implements CheckingAccount {
    private String accountHolder;
    private Double balance;
    private Long accountNumber;
    private String operation;
    private Double value;

    public ConcreteCheckingAccount(String accountHolder, Double balance, Long accountNumber) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    @Override
    public Stratum save() {
        return new ConcreteStratum(this, this.accountHolder, this.balance, this.accountNumber, this.operation, this.value);
    }

    public Double getBalance() {
        return balance;
    }

    private void setValue(Double value) {
        this.value = value;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void makePix(double value) {
        operation = "pix";
        setValue(value);
        balance -= value;
    }

    public void makeDeposit(double value) {
        operation = "depoisto";
        setValue(value);
        balance += value;
    }

    public void pay(double value) {
        operation = "pagamento";
        setValue(value);
        balance -= value;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }
}
