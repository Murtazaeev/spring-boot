package com.temur2spring.mycoolapp.config;

import com.temur2spring.mycoolapp.dependencyInjections.Coach;
import com.temur2spring.mycoolapp.dependencyInjections.SwimCoach;
import org.springframework.context.annotation.Bean;

public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
