package com.luv2code.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("In consructor: " + getClass().getSimpleName());
    }

    //define our init method
    @PostConstruct
    public void doMyStartupStaff(){
        System.out.println("In doMyStartuppStuff(): " + getClass().getSimpleName());
    }

    //define our destroy method
    @PreDestroy
    public void cleanMyStartupStaff(){
        System.out.println("In cleanMyStartupStaff(): " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes :)";
    }
}
