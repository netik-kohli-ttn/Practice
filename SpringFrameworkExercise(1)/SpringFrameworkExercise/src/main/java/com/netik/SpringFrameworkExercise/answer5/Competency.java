package com.netik.SpringFrameworkExercise.answer5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ToTheNew {
    @Autowired
    JVM competency;
    public void show(){
        System.out.println("Welcome to To The New you are in : " + competency.getCompetency());
    }
}
