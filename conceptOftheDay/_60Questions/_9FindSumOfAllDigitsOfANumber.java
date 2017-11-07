package Exercises.conceptOftheDay._60Questions;

public class _9FindSumOfAllDigitsOfANumber {

    /*
    Write a java program to find the sum of all digits of a number? For example,
    if 7456 is the given number, then sum of all digits in 7456 = 7+4+5+6 = 22
     */

    public static void main(String[] args) {

        sumOfNumber(240);
        sumOfNumber(333);
        sumOfNumber(3331);
    }

    public static void sumOfNumber(int number) {

        int copyOfNumber = number;
        int sum = 0;
        while (copyOfNumber != 0) {
            int lastDigit = copyOfNumber % 10;
            sum = sum + lastDigit;
            copyOfNumber = copyOfNumber/10;
        }
        //printing the sum
        System.out.println("Sum of all digits of the number : " + number + " = " + sum);
        }
    }


