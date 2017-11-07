package Exercises.StringProblems.Testing;

public class ReverseWordString {

    public static void main(String[] args) {

        reverseS("Java concept of the day");
    }

    static void reverseS(String s) {

        String[] sArray = s.split(" ");
        String reverseStrig = "";



        for (int i = 0; i < sArray.length; i++) {
            String word = sArray[i];

            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord += word.charAt(j);

            }

            reverseStrig += reverseWord + " ";
        }

        System.out.println(reverseStrig);
    }


}
