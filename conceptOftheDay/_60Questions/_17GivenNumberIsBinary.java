package Exercises.conceptOftheDay._60Questions;

public class _17GivenNumberIsBinary {

    public static void main(String[] args) {
        IsBinary(101010101);
        IsBinary(1275343);
        IsBinary(14023);
        IsBinary(1000001);

    }

    static void IsBinary(int number) {

        boolean isBinary = true;

        int copy = number;
        while (copy != 0) {
            int temp = copy%10; //gives the last digit of the number
            if (temp > 1){
                isBinary = false;
                break;
            }
            else {
                copy = copy / 10; //removes the last digit from the number;
            }
        }
        if(isBinary) {
            System.out.println(number + " is binary number");
        } else {
            System.out.println(number + " is not binary number");
        }
    }
}
