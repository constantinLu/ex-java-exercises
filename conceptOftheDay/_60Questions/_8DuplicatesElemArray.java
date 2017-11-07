package Exercises.conceptOftheDay._60Questions;

import java.util.HashSet;
import java.util.Set;


public class _8DuplicatesElemArray {

//    Write a java program to find duplicate elements in an array?
// For example, duplicate element in {“ONE”, “TWO”, “THREE”, “TWO”, “FOUR”} is “TWO”.

    public static void main(String[] args) {


        String[] strArray = {"abc", "def", "mno", "xyz", "pqr", "xyz", "def"};

        Set<String> duplicates = new HashSet<>();

        for (String s : strArray) {

            if (!duplicates.add(s)) {
                System.out.println(s);
            }
        }

    }
}



