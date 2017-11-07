package Exercises.conceptOftheDay._60Questions;

public class _5checkEquality {


    public static void main(String[] args) {


        //iterative method
        int[] arr1 = {99, 88, 87, 66, 55, 44};
        int[] arr2 = {99, 88, 77, 66, 55, 44};

        boolean equalOrNot = true;


        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    equalOrNot = false;
                }
            }
        } else {
            equalOrNot = false;
        }
        if (equalOrNot) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrayis are not equal");
        }


        //.equals() metroh

        if (arr1.equals(arr2)) {
            System.out.println("TRUE");
        } else {
            System.out.println("Not true");
        }

    }


}
