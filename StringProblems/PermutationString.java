package Exercises.StringProblems;


/*
find all permutations of a string

recusive method
 */
public class PermutationString {

    public static void main(String[] args) {

        StringPermutation("JSP");

    }

    static void StringPermutation(String str) {

        StringPermutation("", str);
    }

    private static void StringPermutation(String permutation, String str) {

        if(str.length() == 0) {
            System.out.println(permutation);
        } else {
            for (int i = 0; i < str.length(); i++) {
                StringPermutation(permutation+str.charAt(i), str.substring(0,i)+str.substring(i+1, str.length()));
            }
        }
    }


}
