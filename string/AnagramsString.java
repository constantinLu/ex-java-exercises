package Exercises.string;

import java.util.Arrays;

public class AnagramsString {

    public static void main(String[] args) {

        isAnagram("The morse code", "Here come dots");
        isAnagram("This is it", "it is this");
        isAnagram("Python is where is the IDE", "Is Python there");
    }


    static void isAnagram(String str1, String str2) {


        //check if the lengts are not equal they are not anagrams
        if (str1.length() != str2.length()) {
            System.out.println("Strings are not anagrams");
            return;
        }

        //convert the strings to an array of lowercases and without spaces
        //and sort it

        String s1 = str1.replaceAll("\\s", "").toLowerCase();
        String s2 = str2.replaceAll("\\s", "").toLowerCase();

        //to charArray
        char[] Array1 = s1.toCharArray();
        char[] Array2 = s2.toCharArray();

        //sort the arrays of characters
        Arrays.sort(Array1);
        Arrays.sort(Array2);

        //if is equal print out
        if (Arrays.equals(Array1,Array2)) {
            System.out.println("Strings are anagrams");
        } else {
            System.out.println("Strings are not anagrams");
        }

        System.out.println();
    }
}
