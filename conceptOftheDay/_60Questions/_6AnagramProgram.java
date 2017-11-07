package Exercises.conceptOftheDay._60Questions;

import java.util.Arrays;

public class _6AnagramProgram {

    public static void main(String[] args) {


        String s1 = "Dormitory";
        String s2 = "Dirty Room  ";

        s(s1,s2);
    }

    static boolean s(String s1, String s2) {
        //converting them to lowercase and remove the whiteSpaces
        String sr1 = s1.replaceAll("\\s", "").toLowerCase();
        String sr2 = s2.replaceAll("\\s", "").toLowerCase();

        //converting them to arrays
        char[] sr1Array = sr1.toCharArray();
        char[] sr2Array = sr2.toCharArray();

        //sorting the arrays with the java.util.array`s method
        Arrays.sort(sr1Array);
        Arrays.sort(sr2Array);

//        System.out.println(sr1Array);
//        System.out.println(sr2Array);


        return (Arrays.equals(sr1Array, sr2Array));
//            System.out.println("the strings are anagrams");
//
//        } else {
//            System.out.println("The strings are NOT anagrams");
//        }
        //System.out.println(sr1Array);
    }
}


