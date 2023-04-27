package Exercises.conceptoftheday._60Questions;

import java.util.HashMap;

public class _12CountOccur {

    public static void main(String[] args) {

        String s = "Java J2EE Java JSP J2EE";
        String s1 = s.replaceAll("\\s", "");

        HashMap<Character, Integer> count = new HashMap<>();

        char[] strArray = s1.toCharArray();


        for (char c : strArray) {
            if (count.containsKey(c)) {
                count.put(c, count.get(c) + 1);
            } else {
                count.put(c, 1);
            }
        }
        System.out.println(count);
    }
}
