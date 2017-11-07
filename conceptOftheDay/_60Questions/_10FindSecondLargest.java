package Exercises.conceptOftheDay._60Questions;

public class _10FindSecondLargest {

  /*
  This is also one of the java interview program asked many a times to java freshers to check the candidate’s
  logical ability and understanding of the language’s fundamentals.
  While writing the program you should not use any sorting methods or any collection types.
  You should find the second largest number in the given array by iterating the array only once.
  These are the likely conditions interviewer may ask you to follow.
  In this article, we will try to find second largest number in an integer array using iterative method.
   */

    public static void main(String[] args) {

        System.out.println(secondLargest(new int[] {3, 5, 6, 1, 5, 2, 9, 44, 312, 222}));
        System.out.println(secondLargest(new int[] {1,1,1,1,1,1,1,1}));

    }

    public static int secondLargest(int[] arr) {
        int firstLargest;
        int secondLargest;

        if (arr[0] > arr[1]) {
            firstLargest = arr[0];
            secondLargest = arr[1];
        } else {
            firstLargest = arr[1];
            secondLargest = arr[0];
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = arr[i];
            } else if (arr[i] < firstLargest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }
}
