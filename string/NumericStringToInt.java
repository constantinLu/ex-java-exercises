package Exercises.string;


/*
convert numeric string to int
 */
public class NumericStringToInt {

    public static void main(String[] args) {

        numString("100");
        numString("23s");
    }

    static void numString(String str) throws  NumberFormatException {

        try {
            int string = Integer.parseInt((String) str);
            System.out.println(string);
        } catch (NumberFormatException e) {
            System.out.println("Number string format needed!");
        }
    }

    static void numStringV(String str)  throws NumberFormatException {

        try {
            int strInt = Integer.valueOf(str);
        } catch (NumberFormatException e) {
            System.out.println("Number string format needed!");
        }

    }
}
