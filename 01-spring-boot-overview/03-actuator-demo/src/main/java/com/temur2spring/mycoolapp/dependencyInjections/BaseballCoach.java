package com.temur2spring.mycoolapp.dependencyInjections;


import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Yay! BaseBAAALLLL";
    }
}
