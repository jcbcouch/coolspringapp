package com.jacobcouch.coolspringapp.coach;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BasketballCoach implements Coach {
    public String getDailyWorkout() {
        return "Practice free throws for 15 minutes";
    }
}
