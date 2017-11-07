package Exercises.StringProblems;


/*
count the vowels
 */
public class countVowels {
    public static void main(String[] args) {

        countVowels("This is a what");
    }

    static void countVowels(String str) {

        int vowels = 0;
        int consonas = 0;
        char ch;
        String sLow = str.toLowerCase().replaceAll("\\s", "");
        for (int i = 0; i < sLow.length(); i++) {
            ch = sLow.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch == 'u') {
                vowels++;

            }
        }
        consonas = sLow.length() - vowels;

        System.out.println("Number of vowels : " + vowels);
        System.out.println("Number of consons: " + consonas);
    }


}
