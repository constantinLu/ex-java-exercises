package Exercises.string;

public class CheckIfStringContainsOnlyDigits {
    public static void main(String[] args) {

        System.out.println(containsOnlyDigits("AB1"));
        System.out.println(containsOnlyDigits("10"));
        System.out.println(containsOnlyDigits("121341421"));

    }

    public static boolean containsOnlyDigits(String s) {


        if (s.isEmpty()) return false;

        for (int i = 0; i < s.length(); i++) {
            char temp = (char) (s.charAt(i) - '0');
            if (temp < 0 || temp > 9)
                return false;
        }

        return true;
    }
}
