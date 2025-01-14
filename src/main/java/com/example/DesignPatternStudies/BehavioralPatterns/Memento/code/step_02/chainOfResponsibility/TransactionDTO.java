package com.example.DesignPatternStudies.BehavioralPatterns.Memento.code.step_02.chainOfResponsibility;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record TransactionDTO(
        String to,
        Double balance,
        LocalDate date,
        LocalDateTime time,
        String operation,
        Double valueTransaction
) {
}
