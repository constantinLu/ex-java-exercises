package Exercises.string;


/*
problem for reversing Strings

 */
public class ReverseString {
    public static void main(String[] args) {

        reverseString("Lungu Catalin");
        reverseStringBuffer("Lungu Catalin");
    }

    static void reverseString(String str) {

        char[] strChar = str.toCharArray();

        for (int i = strChar.length - 1; i >=0; i--) {
            System.out.print(strChar[i]);
        }
        System.out.println("\n");

    }

    static void reverseStringBuffer(String str) {

        StringBuffer reverse = new StringBuffer(str);
        reverse.reverse();
        System.out.print(reverse);
        System.out.println("\n");
    }
}
