package Exercises.conceptOftheDay._60Questions;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class _43SortTextFile {

    public static void main(String[] args) {


        BufferedReader reader = null;
        BufferedWriter writer = null;

        //Create an arrrayList object to hold the lines of input file
        ArrayList<String> lines = new ArrayList<>();

        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\LunguC\\Desktop\\Java.txt"));
            //read all the lines of the input file one by one  and adding them into the arrayList
            String currentLine = reader.readLine();

            while (currentLine != null) {
                lines.add(currentLine);
                currentLine = reader.readLine();
            }

            //sort the arraylist
            Collections.sort(lines);

            //creating bufferedWriter object to write into output file
            writer = new BufferedWriter(new FileWriter("C:\\Users\\LunguC\\Desktop\\javatest.txt"));

            //writing sorted lines into output file

            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            //closing the resouces
            try {
                if (reader != null) {
                    reader.close();
                }
                if (writer != null) {
                    writer.close();

                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
