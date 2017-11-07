package Exercises.conceptOftheDay._60Questions;


// explaining that strings are immutable;
public class _33ProveStringImutable {

    public static void main(String[] args) {

        String s1 = "JAVA";
        String s2 = "JAVA";

        System.out.println(s1 == s2);

        s1 = s1 + " J2EE";
        System.out.println(s1 == s2);
        System.out.println(s1);


        String s3 = new String("JAVA");
        System.out.println(s3);
        s3.concat(" HELLO");
        System.out.println(s3);

    }

}

