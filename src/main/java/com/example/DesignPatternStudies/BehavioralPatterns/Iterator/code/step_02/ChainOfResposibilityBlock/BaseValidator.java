package com.example.DesignPatternStudies.BehavioralPatterns.Iterator.code.step_02.ChainOfResposibilityBlock;

import com.example.DesignPatternStudies.BehavioralPatterns.Iterator.code.step_02.Task02;

public class BaseValidator implements Validator{
    protected Validator next;

    @Override
    public void valid(Task02 task) {
        if (next != null) {
            next.valid(task);
        }
    }

    public BaseValidator setNext(BaseValidator validator) {
        next = validator;
        return validator;
    }
}
