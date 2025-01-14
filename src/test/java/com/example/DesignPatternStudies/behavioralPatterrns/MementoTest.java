package com.example.DesignPatternStudies.behavioralPatterrns;

import com.example.DesignPatternStudies.BehavioralPatterns.Memento.code.step_02.Bank;
import com.example.DesignPatternStudies.BehavioralPatterns.Memento.code.step_02.ConcreteCheckingAccount;
import com.example.DesignPatternStudies.BehavioralPatterns.Memento.code.step_02.chainOfResponsibility.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MementoTest {

    /*@Test
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
    }*/

    @Test
    @DisplayName("Deve registrar extratos de transação bancária se estiver de acordo com as validacoes")
    void mementoTest_step02() {
        var account = new ConcreteCheckingAccount(7000.0, "Steve Rogers", 987645093L, "985");

        account.pay("123456789", 250.0);
        account.makePix("23456", 300.0);
        account.makeDeposit(100.0);
        account.showHistoryTransactions();

        account.pay("34434", 4000.0); // transaction de erro

        account.showBalance();
    }
}
