package Exercises.conceptOftheDay._60Questions;

import java.util.Arrays;

public class _51RemoveDuplicates {

    public static void main(String[] args) {

        removeDuplicates(new int[]{7, 3, 21, 7, 34, 18, 3, 21});
    }

    static void removeDuplicates(int[] arr) {

        System.out.println("Array with duplicates : ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // asuming all the elements are unique;

        int nOfUnique = arr.length;

        // search in the array by index
        for (int i = 0; i < nOfUnique; i++) {
            for (int j = i + 1; j < nOfUnique; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = arr[nOfUnique - 1];
                    nOfUnique--;
                    j--;
                }
            }
        }
        //copy the unique values into the arrayUnique

        int[] arrayUnique = Arrays.copyOf(arr, nOfUnique);
        System.out.println();
        System.out.println("\n The array without duplicates : ");
        for (int i = 0; i < arrayUnique.length; i++) {
            System.out.print(arrayUnique[i] + "\t");
        }


    }
}