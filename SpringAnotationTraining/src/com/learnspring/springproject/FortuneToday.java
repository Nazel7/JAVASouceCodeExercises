package com.learnspring.springproject;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

@Component
public class FortuneToday implements FortuneServices {
    private static List<String> listString;
    private Random rand;
    public static final String LOC_FILE_PATH= "C:\\Users\\lanus\\Desktop\\SpringProgramme\\SpringProjects\\" +
            "JAVAAnotationProjectExercises\\SpringAnotationTraining\\src\\randomFile.txt";

    public FortuneToday() {
        System.out.println("FortuneToday Constructor call======");
    }
    @Override
    public String getFortune() {
        return "FortuneToday calls: is a big win for you....";
    }
    @PostConstruct
    public void initMethod(){

        Path locFile = FileSystems.getDefault().getPath(LOC_FILE_PATH);
        synchronized (this){
            try{
                Scanner scanner= new Scanner(new BufferedReader(Files.newBufferedReader(locFile)));
                listString = new ArrayList<>();
                while(scanner.hasNext()){
                    String result= scanner.nextLine();
                    listString.add(result);
                }
            }catch (IOException e){
                e.printStackTrace();
            }
            rand = new Random();
            int index= rand.nextInt(listString.size());
            System.out.println("\nInitMethod calls after Constructor calls");
            System.out.println(listString.get(index));
        }

    }
    @PreDestroy
    public void destroy(){
        System.out.println("Destroy Method call before bean Destruction.....");

    }
}
