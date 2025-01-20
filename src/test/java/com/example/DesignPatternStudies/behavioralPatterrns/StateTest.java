package com.example.DesignPatternStudies.behavioralPatterrns;

import com.example.DesignPatternStudies.BehavioralPatterns.State.code.step_02.*;
import com.example.DesignPatternStudies.BehavioralPatterns.State.code.step_02.Iterator.*;
import com.example.DesignPatternStudies.BehavioralPatterns.State.code.step_02.Observer.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StateTest {

    /*@Test
    @DisplayName("Projeto deve trocar de comportamento de acordo com seu estado, e seu estado atual deve transitar para outro estado no contexto")
    void stateProjectStep_01() {
        var project = new ProjectContext("To-Do-List", "ultimate");
        var initialState = new SubmittedState();
        project.changeState(initialState);

        project.underEvaluation();
        project.submitted();
        project.approved();
    }*/

    @Test
    @DisplayName("Projeto deve trocar de comportamento de acordo com seu estado, e seu estado atual deve transitar para outro estado no contexto, notificar equipes sobre projeto e iterar sobre projetos")
    void stateProjectStep_02() {
        var notifier = new ConcreteProjectStatusNotifier();
        var collection = new ConcreteCollectionProject();
        var iterator = collection.createIterator();
        var team1 = new ConcreteTeam("DigisSphere");
        var team2 = new ConcreteTeam("Legends");
        var PaymentSystem = new Project(notifier, collection, iterator,"Payment-System","DigisSphere" );
        var ToDoList = new Project(notifier, collection, iterator,"To-Do-List","Legends" );

        notifier.subscribe(PaymentSystem.getTeamName(), team1);
        notifier.subscribe(ToDoList.getTeamName(), team2);

        PaymentSystem.submitted();
        PaymentSystem.underEvaluation();
        PaymentSystem.approved();

        ToDoList.submitted();
        ToDoList.underEvaluation();
        ToDoList.rejected();
    }
}
