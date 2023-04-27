package Exercises.string;

public class ReverseEachWordOfAString {

    public static void main(String[] args) {


        System.out.println(reverseEach("Java Concept of the day"));

    }

    static String reverseEach(String str) {

        String[] words = str.split(" ");
        String reverseString = "";


        for (int i = 0; i < words.length; i++) {
            String word  = words[i];
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0  ; j--) {
                 reverseWord = reverseWord + word.charAt(j);
             }
             reverseString += reverseWord + " ";

        }
        return reverseString;
    }


}
