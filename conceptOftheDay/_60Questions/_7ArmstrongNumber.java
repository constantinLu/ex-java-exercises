package Exercises.conceptOftheDay._60Questions;

public class _7ArmstrongNumber {


    //Write a java program to check whether a given number is Armstrong number or not.
    // A number is called an Armstrong number if it is equal to sum of its digits each raised to the power of number of digits in it.
    // For example: 153, 9474, 54748 are some Armstrong numbers. [Solution]

    //


    public static void check(int number) {

        int copyN = number;
        int nrDigits = Integer.toString(copyN).length();
        int sum = 0;


        while (copyN != 0) {

            int lastDigit = copyN % 10;
            int lastDigitToThePowerOfNoDigits = 1;
            for (int i = 0; i < nrDigits; i++) {
                lastDigitToThePowerOfNoDigits = lastDigitToThePowerOfNoDigits * lastDigit;

            }
            sum = sum + lastDigitToThePowerOfNoDigits;

            copyN = copyN / 10;

        }
        if (sum == number) {
            System.out.println(number + " is a armnstorgNumber");

        } else {
            System.out.println("Is not");
        }
    }


    public static void main(String[] args) {


        check(153);
        check(32423);
    }


}


