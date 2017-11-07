package Exercises.conceptOftheDay._60Questions;

import java.util.Scanner;

public class _2PyramidNumber {

//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        //def the number of Rows by input of the user
//        System.out.println("Enter the number of rows of the pyramid!");
//
//        int numOfRows = sc.nextInt();
//        // by adding the input from the user
//        //def the countRow  = 1;
//        int countRow = 1;
//        for (int i = numOfRows; i > 0; i--) {
//            //printing in a for loop the white spaces starting from the top
//            for (int j = 1; j <= i; j++) {
//                System.out.print(" ");
//            }
//
//            //printing the countNumbers an increment the rows
//            for (int k = 1; k <= countRow; k++) {
//                System.out.print(countRow + " ");
//            }
//            System.out.println();
//            countRow++;
//        }
//    }

//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        // enter the input of how many rows do we want
//
//        System.out.println("Enter the num of rows desired in the pyramid");
//
//        int numOfRows = sc.nextInt();
//        int rowCount = 1;
//
//        for (int i = numOfRows; i > 0; i--) {
//            //printing the white spaces
//            for (int j = 1; j <= i; j++) {
//                System.out.print(" ");
//            }
//
//            //printing the count numbers
//            for (int k = 1; k <= rowCount; k++) {
//                System.out.print(k + " ");
//            }
//            System.out.println();
//            rowCount++;
//        }
//    }


//                     1
//                     1 2
//                     1 2 3
//                     1 2 3 4
//                     1 2 3 4 5
//                     1 2 3 4 5 6
//                     1 2 3 4 5 6 7
//                     1 2 3 4 5 6 7 8
//                     1 2 3 4 5 6 7 8 9


//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        // enter the input of how many rows do we want
//
//        System.out.println("Enter the num of rows desired in the pyramid");
//
//        int numOfRows = sc.nextInt();
//        int rowCount = 1;
//
//        for (int i = numOfRows; i > 0; i--) {
//            //printing the white spaces
//            for (int j = 1; j <= i; j++) {
//                System.out.print(" ");
//            }
//            //printing the count numbers
//            for (int k = 1; k <= rowCount; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//            rowCount++;
//        }
//    }

//        public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        // enter the input of how many rows do we want
//
//        System.out.println("Enter the num of rows desired in the pyramid");
//
//        int numOfRows = sc.nextInt();
//        int rowCount = 1;
//
//        for (int i = numOfRows; i > 0; i--) {
//            //printing the white spaces
//            for (int j = 1; j <= i*2; j++) {
//                System.out.print(" ");
//            }
//            //printing the count numbers
//            for (int k = 1; k <= rowCount; k++) {
//                System.out.print(k + " ");
//            }
//
//            for (int k = rowCount - 1; k >= 1; k--) {
//                System.out.print(k + " ");
//            }
//            System.out.println();
//            rowCount++;
//        }
//    }


//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        // enter the input of how many rows do we want
//
//        System.out.println("Enter the num of rows desired in the pyramid");
//
//        int numOfRows = sc.nextInt();
//        int rowCount = 1;
//
//        for (int i = numOfRows; i > 0; i--) {
//            //printing the white spaces
//            for (int j = 1; j <= i*2; j++) {
//                System.out.print(" ");
//            }
//            //printing the count numbers
//            for (int k = i; k <= numOfRows; k++) {
//                System.out.print(k + " ");
//            }
//
//            for (int k = numOfRows - 1; k >= i; k--) {
//                System.out.print(k + " ");
//            }
//            System.out.println();
//            rowCount++;
//        }
//    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // enter the input of how many rows do we want

        System.out.println("Enter the num of rows desired in the pyramid");

        int numOfRows = sc.nextInt();
        int rowCount = numOfRows;

        for (int i = 1; i <= numOfRows; i++) {
            //printing the white spaces
            for (int j = 1; j <= i * 2; j++) {
                System.out.print(" ");
            }
            //printing the count numbers
            for (int k = 1; k <= rowCount; k++) {
                System.out.print(k + " ");
            }

            for (int k = rowCount - 1; k >= 1; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
            rowCount--;
        }
    }

}





