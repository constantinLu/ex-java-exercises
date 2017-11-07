package Exercises.conceptOftheDay._60Questions;

public class _18CheckOneStringIsRotationOfAnother {

    //If s1 and s2 are two given strings, then write a java program to check whether s2 is a rotated version of s1?

    public static void main(String[] args) {

        String s1 = "JavaJ2eeStrutsHibernate";
        String s2 = "StrutsHibernateJavaJ2ee";
        //isRotated(s1, s2);
        boolean isis = isRotated(s1,s2);
        System.out.println(isis);
        System.out.println(isRotated(s1,s2));
    }

    public static boolean isRotated(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        } else {
            String s3 = s1 + s2;
            System.out.println(s3);
            if (s3.contains(s2)) {
                return true;
            } else {
                return false;
            }


        }

    }

}
