package com.temur2spring.mycoolapp.dependencyInjections;

public class SwimCoach implements Coach {

    public SwimCoach() {
        System.out.println("In the consructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 100 meters as a warm up";
    }
}
