package com.example.DesignPatternStudies.BehavioralPatterns.Memento.code.step_02.chainOfResponsibility;

import com.example.DesignPatternStudies.BehavioralPatterns.Memento.code.step_02.IBank;

public class ValidatePayLimit extends BaseValidator {

    public ValidatePayLimit(IBank bank) {
        super(bank);
    }

    @Override
    public void valid(TransactionDTO transaction) {
        if(transaction.operation().equalsIgnoreCase("payment") && transaction.valueTransaction() >= 3000) {
            bank.undoTransaction();
            System.out.println("ERRO! LIMITE DE TRANSAÇÃO PARA ESTE CANAL É DE 3 MIL REAIS");
        }
        super.valid(transaction);
    }
}
