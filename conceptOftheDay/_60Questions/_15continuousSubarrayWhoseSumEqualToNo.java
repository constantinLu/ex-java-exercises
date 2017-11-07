package Exercises.conceptOftheDay._60Questions;

import java.util.Arrays;

public class _15continuousSubarrayWhoseSumEqualToNo {


    /*
    You have given an integer array and a number. You need to find the continuous sub array of the given array whose sum is equal to given number.
    For example, If {12, 5, 31, 9, 21, 8} is the given array and 45 is the given number, then you have to find
    continuous sub array in this array such that whose elements add up to 45. In this case, {5, 31, 9} is such sub array whose elements add up to 45.
     */

    public static void main(String[] args) {

        contSubarray(new int[] {42, 15, 12, 8, 6, 32},26);
        contSubarray(new int[] {12, 5, 31, 9, 21, 8},49);
        contSubarray(new int[] {15, 31, 371, 8, 1, 25},41);


    }

    public static void contSubarray(int[] arr, int number) {


        //initialize the sum with the first element of the array;
        int sumFirst = arr[0];

        int start = 0;

        for (int i = 1; i < arr.length; i++) {
            sumFirst += arr[i];

            //if sum is greater than inputNumber then following loop is executed until
            //sum becomes either smaller than or equal to the number

            while (sumFirst > number && start <= i - 1) {
                //removing starting elements from the "sum"

                sumFirst -= arr[start];
                //incrementing start by 1
                start++;
            }

            // if sum is equal to 'inputNumber' then printing the sub array
            if(sumFirst == number) {
                System.out.println("Continous subarray of " + Arrays.toString(arr) + " whose sum is " + number + " is");
                for (int j = start; j <= i; j++) {
                    System.out.print(arr[j] + " ");
                }

                System.out.println();
            }
        }
    }
}
