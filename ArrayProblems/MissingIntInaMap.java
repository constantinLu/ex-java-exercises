package Exercises.ArrayProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MissingIntInaMap {

    public static void main(String[] args) {
        int[] x= {1,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
        ArrayList al= new ArrayList();
        Map map= new HashMap();
        for(int i=0;i<x.length;i++)
        {
            map.put(x[i], x[i]);
        }
        for(int i=1;i<=20;i++)
        {
            if(map.get(i)==null)
                al.add(i);
        }
        for(int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }
    }
}
