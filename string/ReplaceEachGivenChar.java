package Exercises.string;
//NOT FINISHED

// replace a character in a string with a set of three characters!
public class ReplaceEachGivenChar {

    public static void main(String[] args) {

        replaceChar("Alma is a dog", ' ', "%552");
        replace("This is Sparta !");
    }

    static void replaceChar(String str, char initial, String replace) {

        int length = str.length();
        int count = 0;
        char[] charStr = str.toCharArray();


        for (int i = 0; i < charStr.length; i++) {
            if (charStr[i] == initial) {
                count++;

            }
        }

        int newLength = length + replace.length() * count;
        char[] repChar = replace.toCharArray();
        char[] newChar = new char[newLength];
        //System.out.println(repChar);
//        System.out.println(repChar[2]);
//        System.out.println(repChar[1]);
//        System.out.println(repChar[0]);

        for (int i = length - 1; i >=0; i--) {
            if (charStr[i] == initial) {
                newChar[newLength - 1] = repChar[2];
                newChar[newLength- 2] = repChar[1];
                newChar[newLength- 3] = repChar[0];
                newLength = newLength - 3;

            } else {
                newChar[newLength - 1] = charStr[i];
                newLength = newLength -1;
            }
        }
        System.out.println("Result : " + String.valueOf(newChar));

    }

    static void replace(String s1) {
        int length = s1.length();
        char[] chars = s1.toCharArray();
        int spaceCount = 0;
        for (int i = 0; i < length; i++) {
            if (chars[i] == ' ') {
                spaceCount++;
            }
        }
        int newLength = length + 2 * spaceCount;
        char [] charsNew = new char [newLength];
        for (int i = length - 1; i >= 0; i--) {
            if (chars[i] == ' ') {
                charsNew[newLength - 1] = '0';
                charsNew[newLength - 2] = '2';
                charsNew[newLength - 3] = '%';
                newLength = newLength - 3;
            } else {
//				System.out.println(chars[i]);
                charsNew[newLength - 1] = chars[i];
                newLength = newLength - 1;
            }
        }
        System.out.println("Output String : " + String.valueOf(charsNew));
    }
}
