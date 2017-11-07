package Exercises.leetcode;

public class _1TwoSum {

    public static void main(String[] args) throws IllegalAccessException {


        int[] arr = {2, 7, 11, 15};
        twoSum(arr, 9);

    }

    public static int[] twoSum(int[] arr, int target) throws IllegalAccessException{

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == target - arr[i]) {
                    return new int[]{i, j};

                }
            }
        }
        throw new IllegalAccessException("No two sum solution");
    }

}