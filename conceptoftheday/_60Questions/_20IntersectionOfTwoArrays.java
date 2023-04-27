package Exercises.conceptoftheday._60Questions;

public class _20IntersectionOfTwoArrays {

    /*
    While developing the real time applications, many times you need to check whether the user input is number or not.
    For example is mobile Number. You have to check whether mobile number entered by user contains only digits or not.
    Those who have developed some real time applications, they may have come across this requirement.
     */

    public static void main(String[] args) {

        System.out.println(numberOrNot("Number1"));
        System.out.println(numberOrNot("1234"));

    }

    public static boolean numberOrNot(String s) {
        try {
            Integer add = Integer.parseInt(s);
            //System.out.println(add);

        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
