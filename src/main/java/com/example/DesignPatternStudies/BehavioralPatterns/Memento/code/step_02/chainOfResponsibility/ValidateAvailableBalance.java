package com.example.DesignPatternStudies.BehavioralPatterns.Memento.code.step_02.chainOfResponsibility;

import com.example.DesignPatternStudies.BehavioralPatterns.Memento.code.step_02.IBank;

public class ValidateAvailableBalance extends BaseValidator{

    public ValidateAvailableBalance(IBank bank) {
        super(bank);
    }

    @Override
    public void valid(TransactionDTO transaction) {
        if(transaction.balance() < transaction.valueTransaction()) {
            bank.undoTransaction();
            System.out.println("ERRO! SALDO INSUFICIENTE");
        }
        super.valid(transaction);
    }
}
