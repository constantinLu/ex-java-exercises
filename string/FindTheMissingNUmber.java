package Exercises.string;

public class FindTheMissingNUmber {

    public static void main(String[] args) {

        int[] arr1 = {1,2,4,5,6,7,8,9};
        missing(arr1);

    }

    static void missing(int[] arr) {

        int n = arr.length - 1;
        int total, number;
        total = (n + 2)*(n+1) /2; //sum of all numbers in the array;
        for (int i = 0; i < n; i++) {
            total = total - arr[i];
        }

        System.out.println(total);

    }
}
