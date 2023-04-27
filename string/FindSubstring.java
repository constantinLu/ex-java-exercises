package Exercises.string;

public class FindSubstring {

    public static void main(String[] args) {

    boolean res = findSubstring("AB", "ABCAD");
    if (res) {
        System.out.println("Substring found");

    } else {
        System.out.println("Not found");
    }
    }

    static boolean findSubstring(String sub, String str) {


        int j = 0;
        // declaring the int lengths of each string
        int strLength = str.length();
        int subLength = sub.length();

        //converting the string in chararrays

        char[] charStr = str.toCharArray();
        char[] charSub = str.toCharArray();

        if (subLength == 0 || subLength > strLength) {
            return false;
        }

        // Traverse str2 and str1, and compare current character
        // of str2 with first unmatched char of str1, if matched
        // then move ahead in str1
        for (int i = 0; i < strLength && j < subLength; i++) {
            if (sub.charAt(j) == str.charAt(i)) {
                j++;
            }
        }

        // If all characters of str1 were found in str2
        return (j == subLength);
    }
}
