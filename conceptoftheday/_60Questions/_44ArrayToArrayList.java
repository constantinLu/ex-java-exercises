package Exercises.conceptoftheday._60Questions;

import java.util.ArrayList;
import java.util.Arrays;

public class _44ArrayToArrayList {


    public static void main(String[] args) {


        String[] array = new String[] {"ANDROID", "JSP", "JAVA", "STRUTS", "HIBERNATE"};
        System.out.println(Arrays.toString(array));

        System.out.println(array.length);
        ArrayList<String> list = new ArrayList<>(Arrays.asList(array));
        System.out.println(list);
    }
}
