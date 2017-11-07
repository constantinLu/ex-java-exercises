package Exercises.StringProblems;

/*
how to print the first non-repeating character from a string

using a HasMap
 */

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class PrintNonRepeatedCharFromString {

    public static void main(String[] args) {

//        firstChar("This is a test");
//        firstChar("TThis is a test");
        firstChar("TTHHiSs SS is a test");
        firstChar("");
    }

    static void firstChar(String str)  {

        if (str.length() < 1) {
            System.out.println("input not correct");
            return;
        }

        Map<Character, Integer> charElements = new LinkedHashMap<>();
        char[] strChar = str.replaceAll("\\s", "").toCharArray();

        for (char c : strChar) {
            if (charElements.containsKey(c)) {
                charElements.put(c, charElements.get(c) + 1);
            } else {
                charElements.put(c, 1);
            }

        }

        //create a set and extact the first element with the value 1
        Set<Character> firstElement = charElements.keySet();
        for (Character ch : firstElement) {
            if (charElements.get(ch) == 1) {
                System.out.println(ch);
                break;
            }
        }

    }
}

