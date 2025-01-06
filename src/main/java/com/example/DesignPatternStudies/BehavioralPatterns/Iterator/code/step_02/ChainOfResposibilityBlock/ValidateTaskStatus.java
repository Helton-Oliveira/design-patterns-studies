package com.example.DesignPatternStudies.BehavioralPatterns.Iterator.code.step_02.ChainOfResposibilityBlock;

import com.example.DesignPatternStudies.BehavioralPatterns.Iterator.code.step_02.Task02;

public class ValidateTaskStatus extends BaseValidator {

    @Override
    public void valid(Task02 task) {
        if(task.getStatus().equalsIgnoreCase("close")) throw new RuntimeException("ERRO TAREFAS CONCLUÍDAS NÃO DEVEM APARECER");
        super.valid(task);
    }
}
