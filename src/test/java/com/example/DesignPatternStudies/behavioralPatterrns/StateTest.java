package com.example.DesignPatternStudies.behavioralPatterrns;

import com.example.DesignPatternStudies.BehavioralPatterns.State.code.step_01.ProjectContext;
import com.example.DesignPatternStudies.BehavioralPatterns.State.code.step_01.SubmittedState;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StateTest {

    @Test
    @DisplayName("Projeto deve trocar de comportamento de acordo com seu estado, e seu estado atual deve trancisionar para outro estado no contexto")
    void stateProjectStep_01() {
        var project = new ProjectContext("To-Do-List", "ultimate");
        var initialState = new SubmittedState();
        project.changeState(initialState);

        project.underEvaluation();
        project.submitted();
        project.approved();
    }
}
