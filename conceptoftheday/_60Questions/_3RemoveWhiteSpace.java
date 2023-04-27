package Exercises.conceptoftheday._60Questions;

public class _3RemoveWhiteSpace {

    //Write a java program to remove all white spaces from a given string.
    public static void main(String[] args) {


        String s = "This Is A Python Programing Test";
        String sW = s.replaceAll("\\s", "");
        System.out.println(sW);


        char[] charS = s.toCharArray();
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < charS.length; i++) {
            if ((charS[i] != ' ') && (charS[i] != '\t')) {
                sb.append(charS[i]);
            }
        }
        System.out.println(sb);
    }
}