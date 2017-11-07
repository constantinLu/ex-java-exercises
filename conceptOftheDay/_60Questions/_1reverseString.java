package Exercises.conceptOftheDay._60Questions;

public class _1reverseString {


    //using for loop
    static void reverseString() {
        //Write a java program to reverse a given string using recursive method.
        String s = "Lungu Catalin";
        char[] sArray = s.toCharArray();
        for (int i = sArray.length - 1; i >= 0; i--) {
            System.out.print(sArray[i]);

        }
    }


    //using StringBUffer class

    static void reverseStringBuffer() {

        StringBuffer sbf = new StringBuffer("Lungu Catalin");
        System.out.println("\n" + sbf.reverse());
    }


    //using recursive method
    static String recursiveMethod(String str) {

        //check if its null or the length is smaller than one , return the actual string
        if ((null == str) || (str.length() <= 1)) {
            return str;
        }
        return recursiveMethod(str.substring(1)) + str.charAt(0);
    }


    public static void main(String[] args) {

        reverseString();
        reverseStringBuffer();
        recursiveMethod(" dsds");
    }
}
