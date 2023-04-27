package Exercises.conceptoftheday._60Questions;

import java.util.HashMap;
import java.util.Set;

public class _4FindDuplicates {


    //Write a java program to find duplicate characters and their count in a given string.
    // For example, in a string “Better Butter”, duplicate characters and their count is t : 4, e : 3, r : 2 and B : 2.

    public static void main(String[] args) {

        String s = "Butter is better be born milk";

        HashMap<Character, Integer> letterMap = new HashMap<>();
        String sd = s.replaceAll("\\s", "");
        char[] sArray = sd.toCharArray();


        for (char c : sArray) {

            if (letterMap.containsKey(c)) {
                letterMap.put(c, letterMap.get(c) + 1);
            } else {
                letterMap.put(c, 1);

            }
        }


        Set<Character> setKeys = letterMap.keySet();

        for (Character ch : setKeys) {
            if (letterMap.get(ch) > 1) {
                System.out.println(ch + " : " + letterMap.get(ch));

            }

        }
    }
}

