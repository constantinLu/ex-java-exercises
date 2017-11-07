package Exercises.indiabix;

public class ArrayConcat {

    public static void main(String[] args) {
        ArrayConcat p = new ArrayConcat();
        p.start();

    }
    static void start() {
        long[] a1 = {3, 4, 5};
        long[] a2 = fix(a1);
        System.out.print(a1[0] + a1[1] + a1[2] + " ");
        System.out.println(a2[0] + a2[1] + a2[2]);
    }

    static long[] fix(long[] a3) {
        a3[1] = 7;
        return a3;
    }



}
