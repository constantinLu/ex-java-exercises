package Exercises.arrayexercises;

public class MissingN {

    public static void main(String[] args) {

        int[] arr2 = {1, 2, 3, 5, 6, 7, 8, 9};
        System.out.println(missingN(arr2));
    }

    static int missingN(int[] arr) {

        int n = arr.length;
        int i, total;

        total = (n+1)*(n+2)/2;
        for (i = 0; i < n; i++) {
            total = total - arr[i];
        }
        return total;
    }
}
