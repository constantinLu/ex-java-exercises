package Exercises.StringProblems.Testing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PrintDuplicates {

    public static void main(String[] args) {

        printDuplicates("ABACCCCD");
        //System.out.println();
        printDuplicates("AA");
        //System.out.println();
        printDuplicates("A");
        //System.out.println();
        printDuplicates("");
    }

    static void printDuplicates(String str) {

        System.out.println("\nFor String : " + str + " there are :");

        //check if the string is null or has just one character
        if(str.length() < 2) {
            System.out.println("String to small to have duplicates");
        }
        //Create a HasMap for adding the char and the values of the count
        Map<Character, Integer> duplicates = new HashMap<>();

        //converting to a charArray

        char[] strChar = str.toCharArray();

        //iterate over the array and find if it containts the key , increment the values if not add the key;
        for (char c : strChar) {
            if (duplicates.containsKey(c)) {
                duplicates.put(c, duplicates.get(c) + 1);
            } else {
                duplicates.put(c, 1);
            }
        }

        //create a set of the hasmap duplicates to iterat over and print the duplicates

        Set<Character> keySet = duplicates.keySet();

        for(Character ch : keySet) {
            if(duplicates.get(ch) > 1) {
                System.out.print(ch + " : " + duplicates.get(ch) + " ");
            }
        }
        System.out.println("\n---------------------");

    }

}
