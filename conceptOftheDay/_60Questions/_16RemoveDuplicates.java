package Exercises.conceptOftheDay._60Questions;

import java.util.ArrayList;
import java.util.HashSet;

class _16RemoveDuplicates {


    //remove duplicates form an arrayList

    //method 1 : using HashSet

    public static void main(String[] args) {

        ArrayList<String> listDuplicates = new ArrayList<String>();

        //adding elements tot the array
        listDuplicates.add("JAVA");

        listDuplicates.add("J2EE");

        listDuplicates.add("JSP");

        listDuplicates.add("SERVLETS");

        listDuplicates.add("JAVA");

        listDuplicates.add("STRUTS");

        listDuplicates.add("JSP");

        System.out.println("Array list with duplicates elements: ");
        System.out.println(listDuplicates);

        //constructing Hasset
        HashSet<String> set = new HashSet<String>(listDuplicates);

        //constructing an arraylist without duplicates using set
        ArrayList<String> listWihoutDuplicates = new ArrayList<>(set);

        //printing array without duplicates
        System.out.println("Array without duplicates: ");

        System.out.println(listWihoutDuplicates);

    }

    //WE CAN TO THIS WITH THE LINKEDHASHSET TO PERSERVE THE INSERTION ORDER

}
