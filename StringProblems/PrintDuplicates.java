package Exercises.StringProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


/*
print out the duplicates characters
 */
public class PrintDuplicates {

    public static void main(String[] args) {

        String s = "ABCDEA";
        printDuplicates("AA");
        printDuplicates("A");

    }

    static void printDuplicates(String str) {
        //check if it`s empty
        if (str.length() < 2)
            System.out.println("Length to short to have duplicates");

        //build a map that contains characters and numbers of time they appear in String
        Map<Character, Integer> duplicates = new HashMap<>();

        char[] strChar = str.toCharArray();

        //foreach loop , if containts add + 1 to value
        //else add the key normaly
        for (char c : strChar) {
            if(duplicates.containsKey(c)) {
                duplicates.put(c, duplicates.get(c) + 1);
            } else {
                duplicates.put(c,1);

            }
        }
        //interate thorugh HasMap to print all duplicates char of the string
        Set<Character> setkeys = duplicates.keySet();
        for (Character ch : setkeys) {
            if (duplicates.get(ch) > 1) {
                System.out.println(ch + " : " + duplicates.get(ch));
            }
        }

    }
}
