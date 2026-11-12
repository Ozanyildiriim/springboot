package com.luv2code.springcoredemo.common;


//Not usıng Component ın purpose
public class SwimCoach implements Coach {

    public SwimCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Swim a 1000 meter for a warm up";
    }


}
