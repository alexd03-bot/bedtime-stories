package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StoryReader {
    public static void main(String[] args) {

        String storyPull;
        String userInput = "goldilocks.txt";
        String fileName = "src/main/resources/" + userInput;

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufReader = new BufferedReader(fileReader);

            String line = bufReader.readLine();

            while (line != null) {
                for(int i = 1; line != null; i++) {

                    System.out.println(i + " " + line);
                    line = bufReader.readLine();
                }

            }
            bufReader.close();


        }
        catch(FileNotFoundException e) {
            System.out.println("We ain't got that");
        }
        catch (IOException e) {
            System.out.println("ERROR");
        }







    }



}
