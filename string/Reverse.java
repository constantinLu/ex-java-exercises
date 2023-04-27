package Exercises.string;

public class Reverse {

    public static void main(String[] args) {

        String s = "Lungu Catalin";
        reverse(s);

        StringBuffer sb = new StringBuffer("Lungu Catalin");
        sb.reverse();
        System.out.println();
        System.out.println(sb);
    }

    static void reverse(String str) {

        char[] s = str.toCharArray();

        for (int i = s.length -1; i >= 0; i--) {
            System.out.print(s[i]);
        }
    }



}
