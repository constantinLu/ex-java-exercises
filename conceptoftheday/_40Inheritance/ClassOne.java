package Exercises.conceptoftheday._40Inheritance;

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

class MainS {
    public static void main(String[] args) {
        ClassTwo t = new ClassTwo();
        System.out.println(ClassOne.i);
        System.out.println(t.j);
    }
}

