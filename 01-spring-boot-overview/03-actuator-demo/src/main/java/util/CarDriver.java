package util;


import org.springframework.stereotype.Component;

@Component
public class CarDriver implements Driver{
    @Override
    public String getDailyDrivenCar() {
        return "I drive Mercedes S class!!!";
    }
}
