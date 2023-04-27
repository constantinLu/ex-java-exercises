package Exercises.conceptoftheday._60Questions;

public class _22ReverseEachWordOfString {


    public static void main(String[] args) {

        String s = "This is what I got from this problem";
        reverse(s);
    }

    public static void reverse(String s) {


        String reverseString = "";
        String[] str = s.split(" ");

        for (int i = 0; i < str.length; i++) {

            String word = str[i];

            String revWord = "";
                for (int j = word.length() - 1; j >= 0; j--) {
                    revWord = revWord + word.charAt(j);
                }
                reverseString += revWord + " ";
        }

        System.out.println(reverseString);

    }


}
