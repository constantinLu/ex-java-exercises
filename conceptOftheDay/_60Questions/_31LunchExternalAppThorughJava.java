package Exercises.conceptOftheDay._60Questions;

import java.io.IOException;

public class _31LunchExternalAppThorughJava {

    public static void main(String[] args) {

        Runtime runthis = Runtime.getRuntime();
        String[] s = new String[] {"C:\\Users\\LunguC\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe", "http://javaconceptoftheday.com/"};

        try {
            runthis.exec(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
