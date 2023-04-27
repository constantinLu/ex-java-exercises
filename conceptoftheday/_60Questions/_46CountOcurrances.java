package Exercises.conceptoftheday._60Questions;

import java.util.Arrays;
import java.util.HashMap;

public class _46CountOcurrances {

    public static void main(String[] args) {

        countOc(new int[] { 12, 9, 12, 9, 10, 9, 10, 11});
    }

    private static void countOc(int[] arr) {


        HashMap<Integer, Integer> elementCount =  new HashMap<Integer, Integer>();
        for (int i : arr) {
            if (!elementCount.containsKey(i)) {
                elementCount.put(i,1);
            } else {
                elementCount.put(i, elementCount.get(i) + 1);
            }

        }
        System.out.println("Input Array : " + Arrays.toString(arr));
        System.out.println(elementCount);
    }
}
