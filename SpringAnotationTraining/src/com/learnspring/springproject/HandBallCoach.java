package com.learnspring.springproject;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Random;

public class HandBallCoach implements Coach {
    @Autowired
    private FortuneServices fortuneServices;
    private String[] str;
    private Random rand;

    @Override
    public String getDailyFortune() {
        return "Wow.. "+ fortuneServices.getFortune();
    }

    @Override
    public String getDailyWorkout() {
        str = new String[]{"DO hard 30 mins press up!", "Hard Slint on Smarching training",
                 "Backhand training by 7.00 early morning", "Jugde for 30 mins before 5AM" };
        rand = new Random();
            int index= rand.nextInt(str.length);
        return str[index];

    }
}
