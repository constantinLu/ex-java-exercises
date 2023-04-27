package Exercises.arrayexercises;

public class SecondLargest {

    public static void main(String[] args) {


        System.out.println(secondLargest(new int[] { 1, 5, 3, 54, 234, 4, 6, 33, 2}));

    }

    static int secondLargest(int[] arr) {

        int firstLargest = 0;
        int secondLargest = 0;
        if (arr[0] > arr[1]) {
            firstLargest = arr[0];
            secondLargest = arr[1];
        } else {
            firstLargest = arr[1];
            secondLargest = arr[2];
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = arr[i];

            } else if(arr[i] < firstLargest && arr[i] > secondLargest) {
                    secondLargest = arr[i];

            }
        }
        return secondLargest;
    }
}
