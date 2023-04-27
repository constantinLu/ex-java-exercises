package Exercises.conceptoftheday._60Questions;

public class _32FindMissingNumberInArray {

    /*
    If ‘n’ is the positive number and ‘a’ is an array of integers of length n-1 containing elements from 1 to n.
    Then find the missing number in ‘a’ in the range from 1 to n. Occurrence of each element is only once. i.e ‘a’ does not contain duplicates.

    If n = 8, then array ‘a’ will have 7 elements in the range from 1 to 8. For example {1, 4, 5, 3, 7, 8, 6}.
    One number will be missing in ‘a’ (2 in this case). You have to find out that missing number.
     */

    public static void main(String[] args) {

        int[] arr = {1, 4, 5, 3, 7, 8, 6};
        System.out.println(missingNumber(arr, 8));

    }
    static int  missingNumber(int[] arr, int n) {

        //calculate the sum on 'n' numbers
        int sum = n*(n+1)/2;
        System.out.println(sum);
        //calculate the sum of all elements in the array
        int sumE = 0;

        for (int i = 0; i < arr.length; i++) {
            sumE = sumE + arr[i];
        }
        System.out.println(sumE);
        int missingN = sum - sumE;

        return missingN;

    }


}
