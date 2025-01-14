package com.example.DesignPatternStudies.BehavioralPatterns.Memento.code.step_02.chainOfResponsibility;

import com.example.DesignPatternStudies.BehavioralPatterns.Memento.code.step_02.IBank;

public class ValidatePixLimit extends BaseValidator{

    public ValidatePixLimit(IBank bank) {
        super(bank);
    }

    @Override
    public void valid(TransactionDTO transaction) {
        if(transaction.operation().equalsIgnoreCase("pix") && transaction.valueTransaction() > 6000){
            bank.undoTransaction();
            System.out.println("ERRO! LIMITE DE TRANSAÇÃO PARA ESTE CANAL É DE 6 MIL REAIS");
        }
        super.valid(transaction);
    }
}
