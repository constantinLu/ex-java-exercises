package Exercises.conceptOftheDay._60Questions;

import java.util.Arrays;

public class _47ReverseArray {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(reverseArray(new int[] {12, 9, 21, 17, 33, 7})));
    }

    static int[] reverseArray(int arr[]) {

        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }
}
