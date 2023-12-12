package com.temur2spring.mycoolapp.dependencyInjections;


import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {


    @Override
    public String getDailyWorkout() {
        return "Practice 5 times a day!!!!";
    }
}
