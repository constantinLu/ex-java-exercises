package Exercises.conceptOftheDay._60Questions;

public class _14FindAllPairsSumEqualNumber {


    public static void FindPairs(int[] arr, int givenNumber) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == givenNumber) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + givenNumber);
                }
            }
        }


    }


    public static void main(String[] args) {


        int arr[] = {5, 5, 7, 4, 3, 12, 3, 3, 8, 2};

        FindPairs(arr, 10);
    }
}
