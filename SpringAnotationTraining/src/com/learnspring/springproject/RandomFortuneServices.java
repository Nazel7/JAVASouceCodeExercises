package com.learnspring.springproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class RandomFortuneServices implements FortuneServices {

    private static List<String> listString;
    private Random rand;
    private static final String LOC_FILE_PATH= "C:\\Users\\lanus\\Desktop\\SpringProgramme\\SpringProjects\\" +
            "JAVAAnotationProjectExercises\\SpringAnotationTraining\\src\\randomFile.txt";

    @Override
    public String getFortune() {
        Path locFile = FileSystems.getDefault().getPath(LOC_FILE_PATH);
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

      return  listString.get(index);
    }
}
