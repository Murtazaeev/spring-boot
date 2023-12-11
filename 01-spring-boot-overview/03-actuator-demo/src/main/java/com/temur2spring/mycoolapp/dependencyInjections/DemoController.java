package com.temur2spring.mycoolapp.dependencyInjections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;

    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach coach){
        myCoach = coach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkOuts(){
        return myCoach.getDailyWorkout();
    }
}
