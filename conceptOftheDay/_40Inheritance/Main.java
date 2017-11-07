package Exercises.conceptOftheDay._40Inheritance;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] countries = {"Belgium", "Rom", "Jap", "Can"};
        Arrays.sort(countries, null);
        for (String con : countries) {
            System.out.println(con + " ");
        }
    }
}