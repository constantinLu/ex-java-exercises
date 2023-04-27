package Exercises.string;

public class ImutableStrings {

    public static void main(String[] args) {

        //literal strings are stored in the String Constant Pool;
        String s1 = "Java is imutable";

        String s2 = "Java is imutable";

        System.out.println(s1 == s2);

        s1 = s1 + "J2EE";

        System.out.println(s1 == s2);


        ////


        String s3 = new String("JAVA");

        System.out.println(s3);         //Output : JAVA

        s3.concat("J2EE");

        System.out.println(s3);         //Output : JAVA
    }
}

