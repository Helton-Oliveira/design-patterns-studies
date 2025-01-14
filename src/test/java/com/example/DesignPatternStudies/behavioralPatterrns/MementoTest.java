package com.example.DesignPatternStudies.behavioralPatterrns;

import com.example.DesignPatternStudies.BehavioralPatterns.Memento.code.step_01.Bank;
import com.example.DesignPatternStudies.BehavioralPatterns.Memento.code.step_01.ConcreteCheckingAccount;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MementoTest {

    @Test
    @DisplayName("Deve registrar extratos de transação bancária")
    void mementoTest_step01() {
        var account = new ConcreteCheckingAccount("Steve Rogers", 2000.0, 987645093L);
        var bank = new Bank(account);

        account.makePix(500);
        bank.backup();
        account.makeDeposit(100);
        bank.ShowLastMonthStatement();
        bank.undoTransaction();
        System.out.println(account.getBalance());
    }
}
