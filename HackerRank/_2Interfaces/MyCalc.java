package Exercises.HackerRank._2Interfaces;

public class MyCalc implements  Advanced {

    @Override
    public int divisor(int n) {

        int j = 0;
        int s = 1;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                j = j + i;
            }

        }
        return j;
    }
}


