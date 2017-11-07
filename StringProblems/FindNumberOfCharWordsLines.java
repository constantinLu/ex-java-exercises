package Exercises.StringProblems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FindNumberOfCharWordsLines {


    /*
    Write a java program to find number of characters, number of words and number of lines in a text file.
     */

    public static void main(String[] args) {


        findInFile();
    }

    static void findInFile() {

        BufferedReader reader = null;

        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;


        try {
            //creating bufferOBject

             reader = new BufferedReader(new FileReader("C:\\Users\\LunguC\\Desktop\\simple.txt"));

            String currentLine = reader.readLine();

            while (currentLine != null) {
                lineCount++;

                //getting the num of words

                String[] words = currentLine.split(" ");

                //updating the wordCount
                wordCount += words.length;


                //iterating each word
                for (String word : words) {
                    charCount += word.length();
                }

                //reading the next lne into currentLine

                currentLine = reader.readLine();
            }

            System.out.println("Num of chars in file : " + charCount);
            System.out.println("Num of words in file : " + wordCount);
            System.out.println("Num of lines in file : " + lineCount);


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e ) {
                e.printStackTrace();
            }
        }


    }
}
