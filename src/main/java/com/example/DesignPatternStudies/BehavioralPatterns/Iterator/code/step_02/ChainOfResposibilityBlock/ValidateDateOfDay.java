package com.example.DesignPatternStudies.BehavioralPatterns.Iterator.code.step_02.ChainOfResposibilityBlock;

import com.example.DesignPatternStudies.BehavioralPatterns.Iterator.code.step_02.Task02;

import java.time.LocalDate;

public class ValidateDateOfDay extends BaseValidator {

    @Override
    public void valid(Task02 task) {
        if (task.getTerm().getDayOfMonth() != LocalDate.now().getDayOfMonth()) {
            throw new RuntimeException("ERRO TAREFA JÁ PASSOU");
        }
        super.valid(task);
    }
}
