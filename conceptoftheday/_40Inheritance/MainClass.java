package Exercises.conceptoftheday._40Inheritance;

public class MainClass
    {
        public MainClass(int i, int j)
        {
            System.out.println(method(i, j));
        }

        int method(int i, int j)
        {
            //System.out.println(j++);
            //System.out.println(++j);

            return i++ + (++j);
        }

        public static void main(String[] args)
        {
            MainClass main = new MainClass(10, 20);
        }
    }
