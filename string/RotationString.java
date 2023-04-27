package Exercises.string;

public class RotationString {

    public static void main(String[] args) {

        System.out.println(rotationString("JavaJ2eeStrutsHibernate", "StrutsHibernateJavaJ2ee"));

    }

    static boolean rotationString(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        String s3 = s1 + s1;
        if (s3.contains(s2)) {
            return true;
        }
        return false;
    }


}
