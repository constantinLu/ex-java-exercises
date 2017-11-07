package Exercises.StringProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountAllOcurencesInString {

    public static void main(String[] args) {


        String s = "This is an exercise in python";
        countAll(s);
    }

    static Set<Character> countAll(String str) {

        if (str.isEmpty()) {
            System.out.println("string to short");
        }

        String strNo = str.trim().replaceAll("\\s", "");
        char[] charStr = strNo.toCharArray();
        System.out.println(charStr);

        Map<Character, Integer> count = new HashMap<>();

        for (Character ch : charStr) {
            if (count.containsKey(ch)) {
                count.put(ch, count.get(ch) + 1);
            } else {
                count.put(ch, 1);
            }
        }

        System.out.println(count);

        Set<Character> printCount = count.keySet();

        for (Character c : printCount) {
            System.out.println(c + " " + count.get(c));


        }
        return printCount;
    }
}
