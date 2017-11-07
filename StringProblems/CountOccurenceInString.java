package Exercises.StringProblems;

public class CountOccurenceInString {

    public static void main(String[] args) {

        countOccurance("abcabc", 'a');
        countOccurance("This is what i got", 'o');
    }

    //method wih an array
    static void countOccurance(String str, char c) {

//        String s = str.replaceAll("\\s", "").toLowerCase();
       // char[] strChar = str.toCharArray();
        int count = 0;
        char charElement;

        for (int i = 0; i < str.length(); i++) {
            charElement = str.charAt(i);
            if (charElement == c) {
                count++;
            }
        }
        System.out.println("Count for : " + c + " is : " + count);
        System.out.println();
    }
}
