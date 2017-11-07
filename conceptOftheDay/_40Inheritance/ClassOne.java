package Exercises.conceptOftheDay._40Inheritance;

public class ClassOne {


    static int i = 111;

    int j = 222;

    {
        i = i++ - ++j;
    }
}

class ClassTwo extends ClassOne
{
    {
        j = i-- + --j;
    }
}

class m {
    public static void main(String[] args) {
        ClassTwo t = new ClassTwo();
        System.out.println(t.i);
        System.out.println(t.j);
    }
}

