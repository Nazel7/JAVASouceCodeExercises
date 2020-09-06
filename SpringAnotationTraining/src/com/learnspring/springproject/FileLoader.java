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

public class FileLoader {

    private static List<String> listString;

    public static void main(String[] args) throws Exception {
        Path locFile = FileSystems.getDefault().getPath("C:\\Users\\lanus\\Desktop\\SpringProgramme\\SpringProjects\\" +
                "JAVAAnotationProjectExercises\\SpringAnotationTraining\\src\\randomFile.txt");
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
        Random rand= new Random();
       int index= rand.nextInt(listString.size());

        System.out.println(listString.get(index));

    }
}