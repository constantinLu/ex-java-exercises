package Exercises.conceptOftheDay._60Questions;

public class _4DuplicatesInts {
    public static void main(String[] args) {

        int[] arr = {1, 4, 5, 2, 1, 2, 3, 87, 44, 2};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i] && (i != j)) {
                    System.out.println("Duplicate ints are : = " + arr[j]);
                }
            }
        }
    }
}
