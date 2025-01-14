package com.example.DesignPatternStudies.BehavioralPatterns.Memento.code.step_02.chainOfResponsibility;

import com.example.DesignPatternStudies.BehavioralPatterns.Memento.code.step_02.IBank;

public class BaseValidator implements ValidateTransaction{
    private ValidateTransaction next;
    protected final IBank bank;

    public BaseValidator(IBank bank) {
        this.bank = bank;
    }

    @Override
    public void valid(TransactionDTO transaction) {
        if(next != null) {
            next.valid(transaction);
        }
    }

    public BaseValidator setNext(ValidateTransaction validateTransaction) {
        this.next = validateTransaction;
        return (BaseValidator) next;
    }
}
