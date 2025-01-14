package com.example.DesignPatternStudies.BehavioralPatterns.Memento.code.step_02.chainOfResponsibility;

import com.example.DesignPatternStudies.BehavioralPatterns.Memento.code.step_02.IBank;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class ValidateTransactionTime extends BaseValidator {

    public ValidateTransactionTime(IBank bank) {
        super(bank);
    }

    @Override
    public void valid(TransactionDTO transaction) {
        var afterTime = LocalTime.of(18, 0);
        var sixPMToday = LocalDateTime.of(transaction.date(), afterTime);
        if(transaction.time().isAfter(sixPMToday)) {
            bank.undoTransaction();
            System.out.println("TRANSAÇÃO NEGADA DEVIDO AO HORÁRIO");
        }
        super.valid(transaction);
    }
}
