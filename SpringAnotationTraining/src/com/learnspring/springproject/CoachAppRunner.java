package com.learnspring.springproject;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoachAppRunner {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context= new
                ClassPathXmlApplicationContext("anotation_applicationContext.xml");
        Coach coach= context.getBean("tennisCoach", Coach.class);
//        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
        System.out.println("\n===================================================================");
//        Coach trackCoach= context.getBean("trackCoach", Coach.class);
//        System.out.println(trackCoach.getDailyWorkout());
//        System.out.println(trackCoach.getDailyFortune());
        context.close();

    }
}
