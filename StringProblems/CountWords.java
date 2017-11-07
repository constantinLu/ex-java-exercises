package Exercises.StringProblems;

public class CountWords {
    public static void main(String[] args) {

        String s = "This is a test of counting words";
        countWords(s);

    }

    static void countWords(String str) {

        String[] words = str.trim().split(" ");
        System.out.println("Number of words = " + words.length);
    }


}
