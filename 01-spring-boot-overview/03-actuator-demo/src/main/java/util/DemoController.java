package util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {

    private Driver myDriver;

    @Autowired
    public DemoController(Driver driver){
        myDriver = driver;
    }

    @GetMapping("/dailydriver")
    public String getDailyDriver(){
        return myDriver.getDailyDrivenCar();
    }
}
