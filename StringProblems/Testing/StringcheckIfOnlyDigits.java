package Exercises.StringProblems.Testing;

public class StringcheckIfOnlyDigits {

    public static void main(String[] args) {

        System.out.println(onlyDigits("10"));
        System.out.println(onlyDigits("digit"));
    }
    static boolean onlyDigits(String s) {

        for (int i = 0; i < s.length(); i++) {
            int temp = (char) s.charAt(i) - '0';
            if (temp < 0 || temp > 9) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }
}
