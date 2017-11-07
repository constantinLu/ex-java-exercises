package Exercises.ArrayProblems;

public class FindMissingNumber {
     /*
    Find the Missing Number:
    You are given a list of n-1 integers and these integers are in the range of 1 to n.
    There are no duplicates in list.
    One of the integers is missing in the list. Write an efficient code to find the missing integer.
    */


    public static void main(String[] args) {

        int arr[] = {1, 2, 4, 5, 6, 7, 8, 9};
        System.out.println(getTheMissingNumber(arr));
    }

// first method

    //get the sum o the numbers n * (n+1)/2;
    //substract all the numbers from sum and you will get the missing numb
    static int getTheMissingNumber(int[] arr) {
        int n = arr.length;
        int i, total;

        total = (n+1)*(n+2) /2; //formula for the sum
        for (i = 0; i < n; i++){
            total = total - arr[i];
        }
        return total;
    }
}
