package com.example.DesignPatternStudies.BehavioralPatterns.Memento.code.step_02.chainOfResponsibility;

import com.example.DesignPatternStudies.BehavioralPatterns.Memento.code.step_02.IBank;

public class ValidateBeneficiaryAccount extends BaseValidator{

    public ValidateBeneficiaryAccount(IBank bank) {
        super(bank);
    }

    @Override
    public void valid(TransactionDTO transaction) {
        if(transaction.to().isBlank() || transaction.to().length() >= 10) {
            bank.undoTransaction();
            System.out.println("ERRO! CONTA NÃO LOCALIZADA PARA TRANSAÇÃO");
        }
        super.valid(transaction);
    }
}
