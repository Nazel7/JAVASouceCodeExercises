package com.learnspring.springproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class TrackCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneServices")
    private FortuneServices fortuneServices;

    @Override
    public String getDailyWorkout() {
        return "Run 10 laps within 10 mins today";
    }

    @Override
    public String getDailyFortune() {
        return "Track Coach Fortune: "+ fortuneServices.getFortune();
    }
}
