package com.temur2spring.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    // expose "/" that return "Hello Temur"

    @GetMapping("/")
    public String sayHelloTemur() {
        return "Hello World";
    }

    //expose a new endpoint for a "workout"

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }


    //expose new endpoint for meal

    @GetMapping("/eat")
    public String getDailyMeal() {
        return "Eat more!";
    }

    //expose new endpoint for a fortune
    @GetMapping("/fortune")
    public String getDailyFortunes() {
        return "Astagfirullah";
    }
}
