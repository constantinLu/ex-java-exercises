package Exercises.string;

public class RemoveWhiteSpaces {


    public static void main(String[] args) {

        String  s = "This is a test in python";

        String str = s.trim().replaceAll("\\s", "");
        System.out.println(s);
        System.out.println();
        System.out.println(str);



        //without replaceAll;
        char[] strChar = str.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < strChar.length; i++) {
            if ((strChar[i] != ' ') && (strChar[i] != '\t')) {
                sb.append(strChar[i]);

            }
        }
        System.out.println();
        System.out.println(sb);


    }
}
