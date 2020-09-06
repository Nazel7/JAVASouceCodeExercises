package com.learnspring.springproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    @Autowired
    @Qualifier("fortuneToday")
    private final FortuneServices fortuneServices;

public TennisCoach(FortuneServices fortuneServices) {
        this.fortuneServices = fortuneServices;
    }

    @Override
    public String getDailyWorkout() {
        return "Hard splint on smarching training";
    }

    @Override
    public String getDailyFortune() {
        return fortuneServices.getFortune();
    }
}
